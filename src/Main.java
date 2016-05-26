import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	private final static int windowWidth = 960, windowHeight = 540;
	private static String question = new String("12345678");
	
	public static void main(String [] args)
	{
		GameColorTrap colorTrap = new GameColorTrap();
		colorTrap.init();
		colorTrap.start();
		colorTrap.setFocusable(true);
		
		JFrame window = new JFrame("Color Trap");
		window.setContentPane(colorTrap);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(windowWidth, windowHeight);
		window.setVisible(true);
		
		/**Waiting for Turtle's class.**/
		/*Text textq = new TextQ();
		question = textq.getText();
		JxlWriteExcel(question);
	*/
	}

}