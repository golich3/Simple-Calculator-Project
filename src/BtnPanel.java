import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {
 
	public BtnPanel() {
		setLayout(new GridBagLayout());
		setBounds(10, 10, 250, 300);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		JButton btn1 = new JButton("1");
		c.weightx = 0.1;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		add(btn1, c);
		
		JButton btn2 = new JButton("2");
		c.gridx = 1;
		c.gridy = 0;
		add(btn2, c);
		
		JButton btn3 = new JButton("3");
		
		c.gridx = 0;
		c.gridy = 1;
		add(btn3, c);
		
		JButton btn4 = new JButton("4");
		c.gridx = 1;
		c.gridy = 1;
		add(btn4, c);
		
		JButton btnAdd = new JButton("+");
		c.gridx = 0;
		c.gridy = 2;
		add(btnAdd, c);
		
		JButton btnMul = new JButton("*");
		c.gridx = 1;
		c.gridy = 2;
		add(btnMul, c);
		
		JButton btnDiv = new JButton("/");
		c.gridx = 0;
		c.gridy = 3;
		add(btnDiv, c);
		
		JButton btnEqual = new JButton("=");
		c.gridx = 1;
		c.gridy = 3;
		add(btnEqual, c);

	}
}
