import java.awt.Graphics;
import java.awt.Color;


public class RactangleDemoPanel extends MyPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RactangleDemoPanel()
	{
		super();
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		int startX = 10;
		int startY = 10;
		
		int endX = 280;
		int endY = 280;
		
		g.drawLine(startX, startY, endX, endY);
		
		startX += 30;
		startY += 30;
		
		endX += 30;
		endY += 30;
		
		g.fillRect(startX, startY, endX, endY);

	}

}
