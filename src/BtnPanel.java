import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {

	public BtnPanel() {
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton btn1 = new JButton("1");
		c.weightx = 0.05;
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		add(btn1, c);
		
		JButton btn2 = new JButton("2");
		c.weightx = 0.05;
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		add(btn2, c);
		
		JButton btn3 = new JButton("3");
		c.weightx = 0.05;
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.WEST;
		add(btn3, c);
		
		JButton btn4 = new JButton("4");
		c.weightx = 0.05;
		c.gridx = 1;
		c.gridy = 1;
		c.anchor = GridBagConstraints.WEST;
		add(btn4, c);
		
		JButton btnAdd = new JButton("+");
		c.weightx = 0.05;
		c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.WEST;
		add(btnAdd, c);
		
		JButton btnMul = new JButton("*");
		c.weightx = 0.05;
		c.gridx = 1;
		c.gridy = 2;
		c.anchor = GridBagConstraints.WEST;
		add(btnMul, c);
		
		JButton btnDiv = new JButton("/");
		c.weightx = 0.05;
		c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.WEST;
		add(btnDiv, c);
		
		JButton btnEqual = new JButton("=");
		c.weightx = 0.05;
		c.gridx = 1;
		c.gridy = 3;
		c.anchor = GridBagConstraints.WEST;
		add(btnEqual, c);

	}
}
