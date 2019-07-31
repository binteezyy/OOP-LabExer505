package labexer505;
import java.awt.*;

class ButtonFramex extends Frame {
	ButtonFramex(String s) {
		super(s);
		setSize(200,100);
		setLayout(new FlowLayout());
		for (int i=0; i<6; i++)
		add(new Button("Button " + i));
		setVisible(true);
	}
}

public class PanganibanACMLABEXER5055 {
	public static void main(String args[]) {
		ButtonFramex buttonFrame = new ButtonFramex("Example 4");
		}
}
