import java.awt.Color;
import java.awt.Graphics;


class RectShape extends Shape 
{
	void draw(Graphics g) 
		{
			g.setColor(color);
			g.fillRect(left,top,width,height);
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), left+width, top+8);
		}
}




