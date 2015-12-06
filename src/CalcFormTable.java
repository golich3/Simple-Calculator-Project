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
	private String frameTxtField;
	private Controller controller;
	private Calculation calculation;

	public String getFrameTxtField() {
		return frameTxtField;
	}

	public void setFrameTxtField(String frameTxtField) {
		this.frameTxtField = frameTxtField;
	}

	public CalcFormTable() {

		super("Calculator");
		setCalcFormTableUI();

		TxtPanel = new TxtPanel();
		add(TxtPanel, BorderLayout.NORTH);
		btnPanel = new BtnPanel();
		add(btnPanel, BorderLayout.CENTER);
		calculation = new Calculation();

		setFrameTxtField(btnPanel.getTxt());

		btnPanel.setiBtnPanel(new IBtnPanel() {

			@Override
			public void btnPanelTextFieldIsFilled(String txt) {
				setFrameTxtField(txt);
				TxtPanel.result.setText(frameTxtField);
			}

			@Override
			public void equalBtnIsClicked() {
				TxtPanel.result.setText(Integer.toString(calculation.calculate(frameTxtField)));
				btnPanel.setTxt(Integer.toString(calculation.calculate(frameTxtField)));
			}
		});
	}

	private void setCalcFormTableUI() {
		setBounds(700, 200, 250, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(0, 50));
		setJMenuBar(createMenuBar());
	}

	private JMenuBar createMenuBar() {
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem save = new JMenuItem("Save");
		save.setIcon(Utils.createIcon("/image/Save16.gif"));
		save.setToolTipText("save to DB");
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				int result = calculation.calculate(frameTxtField);
				controller = new Controller();
				try {
					controller.save(result);
				} catch (ClassNotFoundException e) {
					System.out.println("Driver Not Found");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		file.add(save);
		menu.add(file);
		return menu;
	}

}
