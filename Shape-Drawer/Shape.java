import java.awt.Color;
import java.awt.Graphics;
//this abstract class contains an abstract method called "draw(Graphics g)"
//this provides using of different drawing methods for any inherited class.

abstract class Shape {

int left, top;      
int width, height,nPoints;
int[] PolygonX,PolygonY;
Color color ;  // Color of this shape.
static int shapeName=1;  //this represents the name of shapes.
Integer shapeName1=shapeName;

// reorganize the positions of points except Polygons
void reshape(int left, int top, int width, int height) 
	{
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
	}

void reshapePolygon(int[] PolygonX, int[] PolygonY ) 
{
	this.PolygonX = PolygonX;
	this.PolygonY = PolygonY;
}

//sets new size of the shape
void setSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

//sets new position
void setPosition(int left, int top) 
	{
		this.left = left;
		this.top = top;
	}

void setColor(Color color)
{ this.color = color; }

abstract void draw(Graphics g);  

}  // end of class Shape
