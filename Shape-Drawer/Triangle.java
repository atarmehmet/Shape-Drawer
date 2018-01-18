import java.awt.Color;
import java.awt.Graphics;


class Triangle extends Shape  
{
	void draw(Graphics g) 
		{
			g.setColor(color);
			g.fillPolygon(PolygonX,PolygonY,nPoints) ;
			g.setColor(Color.white);
			g.drawString(shapeName1.toString(), PolygonX[1]+8, PolygonY[1]+8);
		}

}