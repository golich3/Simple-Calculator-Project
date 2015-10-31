import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CalcFormTable extends JFrame {

	private BtnPanel btnPanel;
	private TxtPanel TxtPanel;
			
	
	public CalcFormTable(){
		
		super("Calculator");
		setBounds(700, 200, 250, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(0,50));
		setJMenuBar(createMenuBar());
		
		TxtPanel = new TxtPanel();
		add(TxtPanel,BorderLayout.NORTH);
		
	
		btnPanel = new BtnPanel();
		add(btnPanel, BorderLayout.CENTER);
	}

	private JMenuBar createMenuBar() {
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem save = new JMenuItem();
		save.setIcon(Utils.createIcon("/image/Save16.gif"));
		save.setToolTipText("save to DB");
		
		file.add(save);
		menu.add(file);
		return menu;
	}
}
