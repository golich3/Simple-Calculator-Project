import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel implements ActionListener {

	private String txt = "";
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btnAdd;
	private JButton btnMul;
	private JButton btnEqual;
	private JButton btnDiv;
	private IBtnPanel iBtnPanel;

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getTxt() {
		return txt;
	}

	public void setiBtnPanel(IBtnPanel iBtnPanel) {
		this.iBtnPanel = iBtnPanel;
	}

	public BtnPanel() {

		setLayout(new GridBagLayout());
		setBounds(10, 10, 250, 300);
		GridBagConstraints c = setPublicBtnSpecifications();

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		setButtonPosition(c,btn1,0,0);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		setButtonPosition(c,btn2,1,0);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		setButtonPosition(c,btn3,0,1);

		btn4 = new JButton("4");
		btn4.addActionListener(this);
		setButtonPosition(c,btn4,1,1);

		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		setButtonPosition(c,btnAdd,0,2);

		btnMul = new JButton("*");
		btnMul.addActionListener(this);
		setButtonPosition(c,btnMul,1,2);

		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		setButtonPosition(c,btnDiv,0,3);

		btnEqual = new JButton("=");
		btnEqual.addActionListener(this);
		setButtonPosition(c,btnEqual,1,3);
	}


	private GridBagConstraints setPublicBtnSpecifications() {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0.1;
		c.weighty = 0.1;
		return c;
	}

	private void setButtonPosition(GridBagConstraints c,JButton btnName,int btnXPosition,int btnYPosition) {
		c.gridx = btnXPosition;
		c.gridy = btnYPosition;
		add(btnName, c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()!=btnEqual){
			if (e.getSource()==btn1){
				txt += btn1.getText();
			}else if (e.getSource()==btn2){
				txt += btn2.getText();
			}else if (e.getSource()==btn3){
				txt += btn3.getText();
			}else if (e.getSource()==btn4){
				txt += btn4.getText();
			}else if (e.getSource()==btnAdd){
				txt += " " + btnAdd.getText() + " ";
			}else if (e.getSource()==btnMul){
				txt += " " + btnMul.getText() + " ";
			}else if (e.getSource()==btnDiv){
				txt += " " + btnDiv.getText() + " ";
			}
			iBtnPanel.btnPanelTextFieldIsFilled(txt);

		}else	{
			iBtnPanel.equalBtnIsClicked();
		}
	}
}
