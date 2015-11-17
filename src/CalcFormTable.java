import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CalcFormTable extends JFrame {

	private BtnPanel btnPanel;
	private TxtPanel TxtPanel;
	private String framTxtField;
	private Controller controller;

	// private ICalculation iCalc;
	public String getFramTxtField() {
		return framTxtField;
	}

	public void setFramTxtField(String framTxtField) {
		this.framTxtField = framTxtField;
	}

	// public void setiCalc(ICalculation iCalc) {
	// this.iCalc = iCalc;
	// }

	public CalcFormTable() {

		super("Calculator");
		setBounds(700, 200, 250, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(0, 50));
		setJMenuBar(createMenuBar());

		TxtPanel = new TxtPanel();
		add(TxtPanel, BorderLayout.NORTH);

		btnPanel = new BtnPanel();
		add(btnPanel, BorderLayout.CENTER);

		framTxtField = btnPanel.getTxt();

		btnPanel.setiBtnPanel(new IBtnPanel() {

			@Override
			public void btnPanelTextFieldIsFilled(String txt) {
				setFramTxtField(txt);
				TxtPanel.result.setText(framTxtField);
			}

			@Override
			public void equalBtnIsClicked(String txt) {
				
				TxtPanel.result.setText(Integer.toString(calculate(framTxtField)));
			}
		});
	}

	private JMenuBar createMenuBar() {
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem save = new JMenuItem("Save");
		save.setIcon(Utils.createIcon("/image/Save16.gif"));
		save.setToolTipText("save to DB");
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = calculate(framTxtField);
				try {
					controller = new Controller();
					controller.save(result);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		file.add(save);
		menu.add(file);
		return menu;
	}

	public int calculate(String input) {
		int result = 0;
		String[] inputArray = input.split(" ");
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].equals("+")) {
				result = add(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i-1]=null;
				inputArray[i]= null;
				inputArray[i+1]= Integer.toString(result);
				
			} else if (inputArray[i].equals("*")) {
				result = mul(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i-1]=null;
				inputArray[i]= null;
				inputArray[i+1]= Integer.toString(result);
				
			} else if (inputArray[i].equals("/")) {
				result = div(inputArray[i - 1], inputArray[i + 1]);
				inputArray[i-1]=null;
				inputArray[i]= null;
				inputArray[i+1]= Integer.toString(result);
			}
		}
		return result;
	}

	private int add(String s1, String s2) {
		int s = Integer.parseInt(s1) + Integer.parseInt(s2);
		return s;
	}

	private int mul(String s1, String s2) {
		int s = Integer.parseInt(s1) * Integer.parseInt(s2);
		return s;
	}

	private int div(String s1, String s2) {
		int s = Integer.parseInt(s1) / Integer.parseInt(s2);
		return s;
	}
}
