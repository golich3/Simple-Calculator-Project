import javax.swing.ImageIcon;

public class Utils {

	public static ImageIcon createIcon(String path) {
		java.net.URL url = System.class.getResource(path);
		if (url == null) {
			System.err.println("Unable to load image: " + path);
		}
		ImageIcon icon = new ImageIcon(url);
		return icon;
	}

}
