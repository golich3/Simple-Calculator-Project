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
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;

		btn1 = new JButton("1");
		c.weightx = 0.1;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		add(btn1, c);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += btn1.getText();
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		btn2 = new JButton("2");
		c.gridx = 1;
		c.gridy = 0;
		add(btn2, c);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += btn2.getText();
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btn3 = new JButton("3");
		c.gridx = 0;
		c.gridy = 1;
		add(btn3, c);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += btn3.getText();
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btn4 = new JButton("4");
		c.gridx = 1;
		c.gridy = 1;
		add(btn4, c);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += btn4.getText();
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btnAdd = new JButton("+");
		c.gridx = 0;
		c.gridy = 2;
		add(btnAdd, c);
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += " " + btnAdd.getText() + " ";
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btnMul = new JButton("*");
		c.gridx = 1;
		c.gridy = 2;
		add(btnMul, c);
		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += " " + btnMul.getText() + " ";
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btnDiv = new JButton("/");
		c.gridx = 0;
		c.gridy = 3;
		add(btnDiv, c);
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				txt += " " + btnDiv.getText() + " ";
				iBtnPanel.btnPanelTextFieldIsFilled(txt);
			}
		});

		final JButton btnEqual = new JButton("=");
		c.gridx = 1;
		c.gridy = 3;
		add(btnEqual, c);
		btnEqual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				iBtnPanel.equalBtnIsClicked();
			}
		});

	}
}
