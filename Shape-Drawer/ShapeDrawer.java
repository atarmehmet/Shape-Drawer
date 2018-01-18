// main class for the ShapeDrawer Program
import javax.swing.UIManager;


public class ShapeDrawer {

	public static void main(String args[])
	{
		
		try 
	      {
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	        new Interface().setVisible(true);
	      } catch (Exception e) {  }
	
	}

}
