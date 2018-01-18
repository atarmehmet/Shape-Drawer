import java.awt.Color;
import java.awt.Graphics;

class Circle extends Shape 
{
	void draw(Graphics g) 
		{
			g.setColor(color);
			g.fillOval(left,top,height,height);
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), left+height, top+8);
		}
}