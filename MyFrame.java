import javax.swing.JFrame;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 300;
	private final int HEIGHT = 400;
	private MyPanel panel;
	
	public MyFrame(String title) 
	{
		setTitle(title);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void paintLine()
	{
		panel = new LineDemoPanel();
		add(panel);
		setVisible(true);

	}
	
	public void paintRectangle()
	{
		panel = new RactangleDemoPanel();
		add(panel);
		setVisible(true);

	}
	
	public void paintOval()
	{
		panel = new OvalDemoPanel();
		add(panel);
		setVisible(true);

	}

	
	public static void main(String[] args)
	{
		MyFrame frame = new MyFrame("Line");
		frame.paintLine();
		
		MyFrame frame1 = new MyFrame("Rectangle");
		frame1.paintRectangle();
		
		MyFrame frame2 = new MyFrame("Oval");
		frame2.paintOval();
	}

}