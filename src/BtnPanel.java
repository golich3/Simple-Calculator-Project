import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {

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

		GridBagConstraints c = setPublicBtnSpecifications();

		btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += btn1.getText();
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
				}
			});

		btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += btn2.getText();
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += btn3.getText();
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += btn4.getText();
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += " " + btnAdd.getText() + " ";
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btnMul = new JButton("*");
			btnMul.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += " " + btnMul.getText() + " ";
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					txt += " " + btnDiv.getText() + " ";
					iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					iBtnPanel.equalBtnIsClicked();
			}
		});
		setButtonPosition(c,btn1,0,0);
		setButtonPosition(c,btn2,1,0);
		setButtonPosition(c,btn3,0,1);
		setButtonPosition(c,btn4,1,1);
		setButtonPosition(c,btnAdd,0,2);
		setButtonPosition(c,btnMul,1,2);
		setButtonPosition(c,btnDiv,0,3);
		setButtonPosition(c,btnEqual,1,3);
	}


	private GridBagConstraints setPublicBtnSpecifications() {
		setLayout(new GridBagLayout());
		setBounds(10, 10, 250, 300);
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
}
