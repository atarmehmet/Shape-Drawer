import java.awt.Color;
import java.awt.Graphics;

class Square extends Shape 
{
	void draw(Graphics g) 
		{
			g.setColor(color);
			g.fillRect(left,top,height,height);
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), left+height, top+8);
		} 
}