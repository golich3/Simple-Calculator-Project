import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {
	
	public BtnPanel() {
		setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btnAdd = new JButton("+");
		JButton btnMul = new JButton("*");
		JButton btnDiv = new JButton("/");
		JButton btnEqual = new JButton("=");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnAdd);
		add(btnMul);
		add(btnDiv);
		add(btnEqual);
	}
}
