package labexer505;
import java.awt.*;

class ButtonFrameY extends Frame {
	ButtonFrameY(String s) {
		super(s); setSize(300,200);
		setLayout(new GridLayout(4,3));
		for (int i=0; i<12; i++)
		add(new Button("Button "+i)); setVisible(true);
	}
}

public class PanganibanACMLABEXER5056 {
	public static void main(String args[]) {
		new ButtonFrameY("Example 5");
	}
}
