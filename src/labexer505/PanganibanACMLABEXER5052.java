package labexer505;
import java.awt.*;

class MyFrame extends Frame {
	MyFrame (String s) {
		super(s);
		setBackground(Color.blue);
		setSize(250,100);
		setVisible(true);
	}
}

public class PanganibanACMLABEXER5052 {
	public static void main(String args[]) {
		System.out.println("Creating a 250x100-pixel frame.");
		new MyFrame("Example 2");
		System.out.println("To quit, click on this window and press Ctrl+C");
	}
}
