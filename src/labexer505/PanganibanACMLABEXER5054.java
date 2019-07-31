package labexer505;
import java.awt.*;

class ButtonFrame extends Frame {
	Button button;
	ButtonFrame(String s) {
	super(s);
	setBackground(Color.blue);
	setSize(200,100);
	setLocation(400,50);
	button = new Button("Click Me!");
	add(button);
	setVisible(true);
	}
}

public class PanganibanACMLABEXER5054 {
	public static void main(String args[]) {
		 ButtonFrame buttonFrame = new ButtonFrame("Example 3");
		 }
}
