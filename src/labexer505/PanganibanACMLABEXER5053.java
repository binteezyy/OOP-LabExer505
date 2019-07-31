package labexer505;
import java.awt.*;

class ColoredFrame extends Frame {
	ColoredFrame(String s, Color color, int x, int y) {
		super(s+color.toString());
		 setBackground(color);
		setSize(350,100);
		setLocation(x,y);
		setVisible(true);
	}
}

public class PanganibanACMLABEXER5053 {
	public static void main(String args[]) {
		new ColoredFrame("Red: ",Color.red, 0,0);
		new ColoredFrame("Green: ",Color.green,0,100);
		new ColoredFrame("Yellow: ",Color.yellow,(int) Toolkit.getDefaultToolkit().getScreenSize().getWidth(),200);
		new ColoredFrame("Blue: ",Color.blue,0,300);
		new ColoredFrame("Pink: ",Color.pink,0,400);
	}
}
