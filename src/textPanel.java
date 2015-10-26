import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class textPanel extends JPanel {

	public textPanel() {
		setLayout(new BorderLayout());

		JTextField result = new JTextField();
		result.setEditable(false);
		add(result, BorderLayout.PAGE_START);
	}
}
