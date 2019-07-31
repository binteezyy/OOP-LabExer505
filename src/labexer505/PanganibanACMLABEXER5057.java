package labexer505;
import java.awt.*;

class ButtonFramez extends Frame {
	ButtonFramez(String s) {
		super(s);
		setSize(200,100);
		setLayout(new BorderLayout());
		add(new Button("Superior"),BorderLayout.NORTH);
		add(new Button("Ontario"),BorderLayout.EAST);
		add(new Button("Erie"),BorderLayout.SOUTH);
		add(new Button("Michigan"),BorderLayout.WEST);
		add(new Button("Huron"),BorderLayout.CENTER);
		setVisible(true);
	}
}

public class PanganibanACMLABEXER5057 {
	public static void main(String args[]) {
		new ButtonFramez("Example 6");
	}
}
