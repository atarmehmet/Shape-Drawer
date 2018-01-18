import java.awt.Color;
import java.awt.Graphics;

class LineSegment extends Shape 
{
	void draw(Graphics g) 
		{
			g.setColor(color);
			g.drawLine(left, top, width, height); 
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), left+8, top+8);
		}
}