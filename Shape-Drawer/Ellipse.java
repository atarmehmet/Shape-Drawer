import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

class Ellipse extends Shape 
{
	void draw(Graphics g) 
		{
			Graphics2D g2d = (Graphics2D)g;
			Ellipse2D.Double ellipse = new Ellipse2D.Double(left,top,width,height);
			g2d.setColor(color);
			g2d.fill(ellipse);
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), left+width, top+8);
		}

}