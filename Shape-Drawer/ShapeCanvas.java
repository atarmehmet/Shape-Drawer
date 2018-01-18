import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
//this class shows canvas changes,updates.Implements any button operation.
class ShapeCanvas extends JPanel implements ActionListener {

private static final long serialVersionUID = 1L;

//keeps the list of shapes that are shown in canvas
ArrayList<Shape> shapes = new ArrayList<Shape>();  
Color currentColor=Color.black,changeColor;
int deleteShape,currentShape,changeShape,modifyCB,nPoints,left,top,width,height;
int[] PolygonX,PolygonY; 

// describes the color of the canvas.
ShapeCanvas() { setBackground(new Color(130,130,205)); }   

//all the shapes in ArrayList are painted onto the canvas.
public void paintComponent(Graphics g)
{
	super.paintComponent(g);  
	int max = shapes.size();
		for (int i = 0; i < max; i++)
		{
			Shape s = (Shape)shapes.get(i);
			s.draw(g);  //Uses per shape's draw method
		}
} //end of paintComponent()

// this method recieves all buttons actionPerformed events and performs according to the event
public void actionPerformed(ActionEvent evt) {

//event is assigned to the String type, command variable
String command = evt.getActionCommand();

if (command.equals("Clear ALL")) 
  {
	shapes.clear(); // Remove all items from the ArrayList
	repaint();      // updates the frame with the elements at ArrayList
  }
	else
if (command.equals("DELETE")) 
  {
	shapes.remove(deleteShape);  //Removes selected shape from ArrayList
	repaint();
  }
	else
if (command.equals("ADD")) // adds new shape to the ArrayList 
    switch ( currentShape ) 
    {
       case 0: addShape(new LineSegment()); //sends to addShape method
		    	break;
       case 1: 
    	   	    Shape shape = new Triangle(); 
			    shape.setColor(currentColor);
			    shape.shapeName++;
			    shape.reshapePolygon(PolygonX, PolygonY);
			    shape.nPoints = nPoints;
			    shapes.add(shape);
    	   		repaint();
    	   		break;
       case 2:     
		   	    Shape shape1 = new Parallelogram();
			    shape1.setColor(currentColor);
			    shape1.shapeName++;
			    shape1.reshapePolygon(PolygonX, PolygonY);
			    shape1.nPoints = nPoints;
			    shapes.add(shape1);
		   		repaint();
		   		break;
		    	   
       case 3: addShape(new Square());
				break;
       case 4: addShape(new RectShape());
				break;
       case 5: addShape(new Ellipse());
				break;
       case 6: addShape(new Circle());
				break;
    }
	else
if (command.equals("CHANGE"))
	{   Shape WillBeChanged = shapes.get(changeShape); //defines the shape that will change
		switch ( modifyCB )   //modifyCB defines modification type
	    {
	       case 0:  // change Position
	    	   		if(WillBeChanged instanceof LineSegment)
	    	   		{  //new initial position is top and left, so define ending points
	    	   			width = width - WillBeChanged.left+left; 
	    	   			height = height - WillBeChanged.top+top;
	    	   			WillBeChanged.reshape(left, top, width, height);
	    	   		}
	    	   		else
		    	   	 if(WillBeChanged instanceof Triangle || WillBeChanged instanceof Parallelogram)
		    	   	 {   // new points of triangle and parallelograms are defined
		    	   		 PolygonX[1] = WillBeChanged.PolygonX[1] - WillBeChanged.PolygonX[0] +left ; 
		    	   		 PolygonX[2] = WillBeChanged.PolygonX[2] - WillBeChanged.PolygonX[0] +left ; 
		    	   		 PolygonY[1] = WillBeChanged.PolygonY[1] - WillBeChanged.PolygonY[0] +top ; 
		    	   		 PolygonY[2] = WillBeChanged.PolygonY[2] - WillBeChanged.PolygonY[0] +top ; 
		    	   		if(WillBeChanged instanceof Parallelogram)
		    	   		{
			    	   		 PolygonX[3] = WillBeChanged.PolygonX[3] - WillBeChanged.PolygonX[0] +left ; 
			    	   		 PolygonY[3] = WillBeChanged.PolygonY[3] - WillBeChanged.PolygonY[0] +top ; 
		    	   		}
		    	   		 PolygonX[0] = left; PolygonY[0] = top;
		    	   		 WillBeChanged.reshapePolygon(PolygonX, PolygonY);
		    	   	 }
		    	   	 else // any other shape
		    	   	WillBeChanged.setPosition(left, top); 
	    	   		break;
	       case 1: // set new color of the shape
	    	   		WillBeChanged.setColor(changeColor);
	    	   		break;
	      
	       case 2:  // set new size of the shape
	    	   		if(WillBeChanged instanceof Triangle || WillBeChanged instanceof Parallelogram)
	    	   			WillBeChanged.reshapePolygon(PolygonX, PolygonY);
	    	   		else
	    	   		WillBeChanged.setSize(width,height);
	    	   		break;
	    }
		 repaint(); 
	}
} // end actionPerformed()

	// adds ArrayList shapes except Polygons, because of their difference draw methods.
	void addShape(Shape shape) 
	{
		   shape.setColor(currentColor);
		   shape.shapeName++;
		   shape.reshape(left ,top,width,height);
		   shapes.add(shape);		   repaint();
	} // end of addShape()
	
}  // end class ShapeCanvas




