import java.awt.Graphics;
import java.awt.Color;


public class OvalDemoPanel extends MyPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OvalDemoPanel()
	{
		super();
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		int centerX = 40;
		int centerY = 50;
		
		int width = 40;
		int height = 50;
		
		g.drawOval(centerX, centerY, width, height);
	}
		

}
