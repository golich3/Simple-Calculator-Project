import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TxtPanel extends JPanel {

	public TxtPanel() {
		setLayout(new BorderLayout());
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		JTextField result = new JTextField();
		result.setEditable(false);
		result.setFont(font1);
		add(result, BorderLayout.PAGE_START);
	}
}
