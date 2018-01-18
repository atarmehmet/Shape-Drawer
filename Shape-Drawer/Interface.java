// these class files need to be imported. 
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

// this class denotes user interface. 
//Also inherited from JFrame class.
public class Interface extends JFrame {

	//defining user interface tools to get data correctly.
	private static final long serialVersionUID = 1L;
	ShapeCanvas canvas; // will be added tools and shapes.
	private JButton AddButton = null;  
	private JComboBox ShapeCB = null;
	private JComboBox ColorCB = null;
	private JTextField Xax = null;
	private JLabel X1Label = null;
	private JTextField Yax = null;
	private JLabel Y1Label = null;
	private JTextField RHeight = null;
	private JTextField RWidth = null;
	private JLabel ShapeObjects = null;
	private JComboBox DeleteCB = null;
	private JButton DeleteButton = null;
	private JButton ClearButton = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JComboBox ModifyCB = null;
	private JLabel jLabel5 = null;
	private JTextField Xaxis2 = null;
	private JTextField Yaxis2 = null;
	private JButton ChangeButton = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JComboBox NewColorCB = null;
	private JComboBox ShapeSelectCB = null;
	//deleteCB = to understand the index of shape, which will be deleted. 
	Integer deleteCB=1;  //  @jve:decl-index=0:
	// modifyCB = to understand which instance of shape is selected to modify.
	int modifyCB; 
	private JTextField RHeight2 = null;
	private JTextField RWidth2 = null;
	private JTextField X2 = null;
	private JTextField Y2 = null;
	private JTextField X3 = null;
	private JTextField Y3 = null;
	private JLabel X2Label = null;
	private JLabel Y2Label = null;
	private JLabel X3Label = null;
	private JLabel Y3Label = null;
	private JLabel X22Label = null;
	private JLabel X32Label = null;
	private JLabel Y22Label = null;
	private JLabel Y32Label = null;
	private JLabel author = null;
	
	//constructor method for this class
	public Interface() {
		super();
		initialize();
	} //end of constructor 
	
    //initialize method for tools that get data
	private void initialize() {
		author = new JLabel();
		author.setBounds(new Rectangle(649, 558, 146, 33));
        author.setFont(new java.awt.Font("Vivaldi", 3, 18)); 
        author.setText("Mehmet ATAR ");
		Y32Label = new JLabel();
		Y32Label.setBounds(new Rectangle(688, 509, 34, 14));
		Y32Label.setVisible(false);
		Y32Label.setText(": Y3");
		Y22Label = new JLabel();
		Y22Label.setBounds(new Rectangle(688, 484, 34, 14));
		Y22Label.setVisible(false);
		Y22Label.setText(": Y2 ");
		X32Label = new JLabel();
		X32Label.setBounds(new Rectangle(552, 508, 34, 14));
		X32Label.setVisible(false);
		X32Label.setText("X3 :");
		X22Label = new JLabel();
		X22Label.setBounds(new Rectangle(552, 486, 34, 14));
		X22Label.setVisible(false);
		X22Label.setText("X2 :");
		Y3Label = new JLabel();
		Y3Label.setBounds(new Rectangle(680, 190, 43, 14));
		Y3Label.setText(":Y3");
		Y3Label.setVisible(false);
		X3Label = new JLabel();
		X3Label.setBounds(new Rectangle(680, 167, 43, 14));
		X3Label.setText(":X3");
		X3Label.setVisible(false);
		Y2Label = new JLabel();
		Y2Label.setBounds(new Rectangle(557, 190, 43, 14));
		Y2Label.setText("Y2:");
		X2Label = new JLabel();
		X2Label.setBounds(new Rectangle(557, 168, 43, 14));
		X2Label.setText("X2:");
		jLabel7 = new JLabel();
		jLabel7.setBounds(new Rectangle(639, 448, 102, 14));
		jLabel7.setText("New Y:");
		jLabel6 = new JLabel();
		jLabel6.setBounds(new Rectangle(576, 448, 193, 14));
		jLabel6.setText("New X:");
		jLabel5 = new JLabel();
		jLabel5.setBounds(new Rectangle(563, 348, 121, 23));
		jLabel5.setText("  Modification");
		jLabel5.setFont(new java.awt.Font("Verdana", 1, 15));
		jLabel4 = new JLabel();
		jLabel4.setBounds(new Rectangle(561, 245, 118, 14));
		jLabel4.setFont(new java.awt.Font("Verdana", 1, 15));
		jLabel4.setText("Delete & Clear");
		jLabel3 = new JLabel();
		jLabel3.setBounds(new Rectangle(563, 10, 143, 21));
		jLabel3.setFont(new java.awt.Font("Verdana", 1, 15));
		jLabel3.setText("Shape & Color");
		jLabel2 = new JLabel();
		jLabel2.setBounds(new Rectangle(559, 66, 138, 26));
		jLabel2.setFont(new java.awt.Font("Verdana", 1, 15));
		jLabel2.setText("Position & Size");
		ShapeObjects = new JLabel();
		ShapeObjects.setBounds(new Rectangle(569, 146, 142, 14));
		ShapeObjects.setText("Line's Ending Coordinats"); 
		Y1Label = new JLabel();
		Y1Label.setBounds(new Rectangle(625, 98, 63, 19));
		Y1Label.setText("Y1 Point:");
		X1Label = new JLabel();
		X1Label.setBounds(new Rectangle(562, 99, 63, 19));
		X1Label.setText("X1 Point:");
		this.setSize(809, 628);
		this.setTitle("...::: Shape-Drawer :::...");
		canvas = new ShapeCanvas(); // constructing canvas.
		//adding tools to the canvas
		canvas.setLayout(null);
		canvas.add(getAddButton(), null);
		canvas.add(getShapeCB(), null);
		canvas.add(getColorCB(), null);
		canvas.add(getXax(), null);
		canvas.add(X1Label, null);
		canvas.add(getYax(), null);
		canvas.add(Y1Label, null);
		canvas.add(getRHeight(), null);
		canvas.add(getRWidth(), null);
		canvas.add(ShapeObjects, null);
		canvas.add(getDeleteCB(), null);
		canvas.add(getDeleteButton(), null);
		canvas.add(getClearButton(), null);
		canvas.add(jLabel2, null);
		canvas.add(jLabel3, null);
		canvas.add(jLabel4, null);
		canvas.add(getModifyCB(), null);
		canvas.add(jLabel5, null);
		canvas.add(getXaxis2(), null);
		canvas.add(getYaxis2(), null);
		canvas.add(getChangeButton(), null);
		canvas.add(jLabel6, null);
		canvas.add(jLabel7, null);
		canvas.add(getNewColorCB(), null);
		canvas.add(getModifyCB(), null);
		canvas.add(getModifyCB(), null);
		canvas.add(getModifyCB(), null);
		canvas.add(getModifyCB(), null);
		canvas.add(getModifyCB(), null);
		canvas.add(getShapeSelectCB(), null);
		canvas.add(getRHeight2(), null);
		canvas.add(getRWidth2(), null);
		canvas.add(getX2(), null);
		canvas.add(getY2(), null);
		canvas.add(getX3(), null);
		canvas.add(getY3(), null);
		canvas.add(X2Label, null);
		canvas.add(Y2Label, null);
		canvas.add(X3Label, null);
		canvas.add(Y3Label, null);
		canvas.add(X22Label, null);
		canvas.add(X32Label, null);
		canvas.add(Y22Label, null);
		canvas.add(Y32Label, null);
		canvas.add(author, null);
		this.setContentPane(canvas);
		//frame's default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end of Initialize().
	
	//constructs "AddButton", defines operations when user presses this button
	private JButton getAddButton() {
		if (AddButton == null) {
			AddButton = new JButton();
			AddButton.setBounds(new Rectangle(594, 210, 67, 26));
			AddButton.setText("ADD");
			AddButton.addActionListener(new java.awt.event.ActionListener() {
				//this method runs when user presses "AddButton".
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// left = defines the x coordinat of initial position
					// top =  defines the y coordinat of initial position
					canvas.left= Integer.parseInt(Xax.getText()); Xax.setText("");
					canvas.top = Integer.parseInt(Yax.getText()); Yax.setText("");
					// gets inputs from textfields according to the selected shape.
					// canvas.currentShape is ShapeCB's index number.
					switch ( canvas.currentShape ) {
		               case 0: case 4:  // if selected shape is straightLine or rectangle.
		            	   	     // Ending points for straightLine or width and height for rectangle.
		            	         canvas.width = Integer.parseInt(RWidth.getText()); 
		            	   	     canvas.height = Integer.parseInt(RHeight.getText()); 
		            	   	     break;
		               case 1:  // if selected shape is a triangle
		            	        // assigns three points for triangle
		            	   		 canvas.PolygonX = new int[3];
		            	   		 canvas.PolygonY = new int[3];
			            	   	 canvas.nPoints = 3;
		            	   		 canvas.PolygonX[0] = canvas.left;
		            	   		 canvas.PolygonY[0] = canvas.top;
			            	   	 canvas.PolygonX[1] = Integer.parseInt(RHeight.getText());
		            	   		 canvas.PolygonY[1] = Integer.parseInt(RWidth.getText());
		            	   		 canvas.PolygonX[2] = Integer.parseInt(RHeight2.getText());
		            	   		 canvas.PolygonY[2] = Integer.parseInt(RWidth2.getText());
		            	   		 break;
		               case 2:  // if selected shape is a parallelogram 
		            	   		// assigns parallelogram's three points
	            	   		  	 canvas.PolygonX = new int[4];
	            	   		     canvas.PolygonY = new int[4];
		            	   	     canvas.nPoints = 4;
		            	   		 canvas.PolygonX[0] = canvas.left;
		            	   		 canvas.PolygonY[0] = canvas.top;
		            	   	     canvas.PolygonX[1] = Integer.parseInt(RHeight.getText());
		            	   		 canvas.PolygonY[1] = Integer.parseInt(RWidth.getText());
		            	   		 canvas.PolygonX[3] = Integer.parseInt(RHeight2.getText());
		            	   		 canvas.PolygonY[3] = Integer.parseInt(RWidth2.getText());
			            	   	 canvas.PolygonX[2] = canvas.PolygonX[3]+canvas.PolygonX[1]-canvas.PolygonX[0];
			            	   	 canvas.PolygonY[2] = canvas.PolygonY[3]+canvas.PolygonY[1]-canvas.PolygonY[0];
		            	   	     break;
		               case 3:   // if selected shape is a square, assigns square's edge
		            	   		 canvas.height = Integer.parseInt(RHeight.getText());
		            	   		 break;
		               case 5:   // if selected shape is an ellipse  
		            	   		 // gets two radius for ellipse, minor and major radiuses
								 canvas.width = (Integer.parseInt(RWidth.getText()))*2;
								 canvas.height = (Integer.parseInt(RHeight.getText()))*2;
								 break;	
		               case 6:   // if selected shape is a circle, assigns circle's radius
								 canvas.height = (Integer.parseInt(RHeight.getText()))*2;
								 break;
		            }
					//Initialize again the textfields to avoid confusion.
					RWidth.setText(""); RHeight.setText("");
					RWidth2.setText(""); RHeight2.setText("");
					// add DeleteCB and ShapeSelectCB tools the new shape
					DeleteCB.addItem(deleteCB);
					ShapeSelectCB.addItem(deleteCB); //will be used for modification
					deleteCB++;
					//send button command to the actionPerformed method that belongs to ShapeCanvas class.
					canvas.actionPerformed(e);  
				}
			});
		}
		return AddButton;
	} // end of getAddButton().
	
	// this tool(ShapeCB) decides the shape that will be added to canvas.
	private JComboBox getShapeCB() {
		if (ShapeCB == null) {
			ShapeCB = new JComboBox();
			ShapeCB.setBounds(new Rectangle(531, 33, 93, 20));
			ShapeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Straight Line", "Triangle", "Parallelogram", "Square", "Rectangle", "Ellipse", "Circle" }));
			ShapeCB.addActionListener(new java.awt.event.ActionListener() {
				//this method runs every index change of "ShapeCB" tool.
				public void actionPerformed(java.awt.event.ActionEvent e) {
					canvas.currentShape = ShapeCB.getSelectedIndex();
					ShapeObjects.setBounds(new Rectangle(569, 146, 142, 14));
					RHeight.setBounds(new Rectangle(606, 166, 45, 17));
					RWidth.setBounds(new Rectangle(606, 189, 45, 17));
					Y1Label.setText("Y axis:");
					X1Label.setText("X axis:");
      			    RWidth2.setVisible(false);
    			    RHeight2.setVisible(false);
    			    Y2Label.setVisible(false); Y2Label.setText("Y2 :");
    			    X2Label.setVisible(false); X2Label.setText("X2 :");
    			    X3Label.setVisible(false); 
    			    Y3Label.setVisible(false);
    		  //this case condition sets labels ands textfields' conditions according to the selected shapes
					switch ( canvas.currentShape ) {
		               case 0:    ShapeObjects.setText("Line's Ending Coordinats"); 
		               			  Y1Label.setText("Y1 Point:");
		               			  X1Label.setText("X1 Point:");
		          			      Y2Label.setVisible(true);
		        			      X2Label.setVisible(true);
		               			  RWidth.setVisible(true); 
		               			  break;
		               case 1: case 2:  
			            	      if(canvas.currentShape == 1)  
			            	   	    {ShapeObjects.setText("  Triangle's Edge Points");
			            	   	     X3Label.setText(": X3");
			            	   	     Y3Label.setText(": Y3");
			            	   	    }
			            	   		 else {ShapeObjects.setText("Parallelogram's Edge Points");
					            	   		 X3Label.setText(": X4");
					            	   	     Y3Label.setText(": Y4");
			            	   		 		}
		               			  Y1Label.setText("Y1 Point:");
		               			  X1Label.setText("X1 Point:");
		               			  RWidth.setBounds(new Rectangle(577, 189, 45, 17));
		               			  RHeight.setBounds(new Rectangle(577, 166, 45, 17));
		          			      Y2Label.setVisible(true);
		          			      X2Label.setVisible(true);
		          			      X2Label.setBounds(new Rectangle(557, 167, 43, 14));
		          			      Y2Label.setBounds(new Rectangle(557, 190, 43, 14));
		          			      X3Label.setVisible(true);
			        			  Y3Label.setVisible(true);
			        			  RWidth.setVisible(true);
			        			  RWidth2.setVisible(true);
			        			  RHeight2.setVisible(true); 
		            	   		  break;
		               case 3:    
		            	   		  ShapeObjects.setText("Square's Edge");
		            	   		  ShapeObjects.setBounds(new Rectangle(590, 163, 142, 14));
		               			  RHeight.setBounds(new Rectangle(603, 181, 45, 17));
		               			  RWidth.setVisible(false);
		               			  break;
		               case 4:    
		            	          ShapeObjects.setText("Rectangle's Edges");
		                		  X2Label.setVisible(true);  X2Label.setText("Height :");
		                		  Y2Label.setVisible(true);  Y2Label.setText("Width :");
		            			  RWidth.setVisible(true);
		            	   		  break;
		               case 5:    
		            	          ShapeObjects.setText("Ellipse's Radiuses");   
			             		  X2Label.setVisible(true);  X2Label.setText("@Y axis:");
			            		  Y2Label.setVisible(true);  Y2Label.setText("@X axis:");
			        			  RWidth.setVisible(true);
		               			  break;
		               case 6:    
		            	          ShapeObjects.setText("Circle's Radius");
			           			  RWidth.setVisible(false);
			           			  ShapeObjects.setBounds(new Rectangle(590, 163, 142, 14));
			           			  RHeight.setBounds(new Rectangle(603, 181, 45, 17));
		               			  break;
		            }
				
				}
			});
		}
		return ShapeCB;
	} // end of ShapeCB.

	// gets selected color and assigns to the variable for canvas.
	private JComboBox getColorCB() {
		if (ColorCB == null) {
			ColorCB = new JComboBox();
			ColorCB.setBounds(new Rectangle(629, 33, 93, 20));
			ColorCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black","Blue","Cyan","Gray","Green","Magenta","Red","Yellow" }));
			ColorCB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					switch ( ColorCB.getSelectedIndex() ) {
		               case 0: canvas.currentColor = Color.black;   break;
		               case 1: canvas.currentColor = Color.blue;    break;
		               case 2: canvas.currentColor = Color.cyan;    break;
		               case 3: canvas.currentColor = Color.gray;    break;
		               case 4: canvas.currentColor = Color.green;   break;
		               case 5: canvas.currentColor = Color.magenta; break;
		               case 6: canvas.currentColor = Color.red;     break;
		               case 7: canvas.currentColor = Color.yellow;  break;
		            }
				}
			});
		}
		return ColorCB;
	} // end of ColorCB

	// textfield definition for Xax variable
	private JTextField getXax() {
		if (Xax == null) {
			Xax = new JTextField();
			Xax.setBounds(new Rectangle(571, 119, 45, 17));
		}
		return Xax;
	}

	// textfield definition for Yax variable
	private JTextField getYax() {
		if (Yax == null) {
			Yax = new JTextField();
			Yax.setBounds(new Rectangle(628, 118, 45, 17));
		}
		return Yax;
	}

	
	private JTextField getRHeight() {
		if (RHeight == null) {
			RHeight = new JTextField();
			RHeight.setBounds(new Rectangle(606, 166, 45, 17));
		}
		return RHeight;
	}

	private JTextField getRWidth() {
		if (RWidth == null) {
			RWidth = new JTextField();
			RWidth.setBounds(new Rectangle(606, 189, 45, 17));
		}
		return RWidth;
	}

	private JComboBox getDeleteCB() {
		if (DeleteCB == null) {
			DeleteCB = new JComboBox();
			DeleteCB.setBounds(new Rectangle(544, 269, 68, 20));
		}
		return DeleteCB;
	}

	//when user clickes on this button, the shape position at DeleteCB is assigned to canvas.deleteShape variable
	// and this item is removed from DeleteCB and ShapeSelectCB and also from the arrayList of shapes.
	private JButton getDeleteButton() {
		if (DeleteButton == null) {
			DeleteButton = new JButton();
			DeleteButton.setBounds(new Rectangle(632, 268, 73, 21));
			DeleteButton.setText("DELETE");
			DeleteButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					canvas.deleteShape = DeleteCB.getSelectedIndex() ; 
					DeleteCB.removeItemAt(canvas.deleteShape);				
					ShapeSelectCB.removeItemAt(canvas.deleteShape+1);		
					canvas.actionPerformed(e);
				}
			});
		}
		return DeleteButton;
	}// end of DeleteButton

	// this button clears all the shapes that took place on canvas.
	// Also DeleteCB & ShapeSelectCB tools are emptied.
	private JButton getClearButton() {
		if (ClearButton == null) {
			ClearButton = new JButton();
			ClearButton.setBounds(new Rectangle(577, 299, 84, 27));
			ClearButton.setText("Clear ALL");
			ClearButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DeleteCB.removeAllItems();
					ModifyCB.setSelectedIndex(0);
					ShapeSelectCB.removeAllItems();
					ShapeSelectCB.addItem("< Select Shape >");
					canvas.actionPerformed(e);
				}
			});
		}
		return ClearButton;
	}// end of ClearButton
	
    // this ComboBox tools defines the modify operations 
    //and sets labels and buttons visibility according to the shape and also modify type.
	private JComboBox getModifyCB() {
		if (ModifyCB == null) {
			ModifyCB = new JComboBox();
			ModifyCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Change Position","Change Color","Change Size" }));
			ModifyCB.setBounds(new Rectangle(575, 385, 113, 20));
			ModifyCB.addActionListener(new java.awt.event.ActionListener() {   
				public void actionPerformed(java.awt.event.ActionEvent e) {   
			        	   		X2.setVisible(false);  X22Label.setVisible(false);
			        	   		X3.setVisible(false);  X32Label.setVisible(false);
			        	   		Y2.setVisible(false);  Y22Label.setVisible(false);
			        	   		Y3.setVisible(false);  Y32Label.setVisible(false);
		            	   		Xaxis2.setVisible(false);
		            	   		Yaxis2.setVisible(false);
		            	   		jLabel6.setVisible(false);
		            	   		jLabel7.setVisible(false);
	            	   		    NewColorCB.setVisible(false);
	            	   		    ChangeButton.setBounds(new Rectangle(588, 491, 83, 24));
					switch ( ModifyCB.getSelectedIndex() ) {
		               case 0: // Change Position is selected
		            	   		Xaxis2.setVisible(true);
		            	   		Yaxis2.setVisible(true);
		            			jLabel6.setText("New X:");
		            			jLabel7.setText("New Y:");
		            			jLabel6.setVisible(true);
		            			jLabel7.setVisible(true);
		            	   		break;
		               case 1: // Change Color is selected
		            	   		NewColorCB.setVisible(true);
		            	   		break;
		               case 2: 	// Change size is selected 
		            	    	// will be constructed according to the instance of shape(look ShapeSelectCB)
		            	   		ShapeSelectCB.setSelectedIndex(0);
			        	   		break;		            	   		
					}
				}
			
			});
		}
		return ModifyCB;
	}// end of ModifyCB


	private JTextField getXaxis2() {
		if (Xaxis2 == null) {
			Xaxis2 = new JTextField();
			Xaxis2.setBounds(new Rectangle(576, 463, 45, 17));
		}
		return Xaxis2;
	}

	private JTextField getYaxis2() {
		if (Yaxis2 == null) {
			Yaxis2 = new JTextField();
			Yaxis2.setBounds(new Rectangle(637, 464, 45, 17));
		}
		return Yaxis2;
	}

	// Performs modification operations according to shape and modify selection
	private JButton getChangeButton() {
		if (ChangeButton == null) {
			ChangeButton = new JButton();
			ChangeButton.setBounds(new Rectangle(588, 491, 83, 24));
			ChangeButton.setText("CHANGE");
			ChangeButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					canvas.modifyCB = ModifyCB.getSelectedIndex(); 
					canvas.changeShape = ShapeSelectCB.getSelectedIndex()-1; // represents
					switch(canvas.modifyCB)
					{
						case 0:// Change Position-> new initial coordinats are token
								canvas.left= Integer.parseInt(Xaxis2.getText());  
								canvas.top = Integer.parseInt(Yaxis2.getText());  
								break;
						case 1: // Change Color -> new Shape color value is token
								switch ( NewColorCB.getSelectedIndex() ) 
								{
					               case 0: canvas.changeColor = Color.black;   break;
					               case 1: canvas.changeColor = Color.blue;    break;
					               case 2: canvas.changeColor = Color.cyan;    break;
					               case 3: canvas.changeColor = Color.gray;    break;
					               case 4: canvas.changeColor = Color.green;   break;
					               case 5: canvas.changeColor = Color.magenta; break;
					               case 6: canvas.changeColor = Color.red;     break;
					               case 7: canvas.changeColor = Color.yellow;  break;
					            }
							    break;
						case 2: // Change Size, this runs according to the shape instances.
								// Sets given data to the correct variables.
								switch ( modifyCB ) // modifyCB represents shape instance index.
								{
					               case 1: case 2: // if triangle or parallelogram
					            	   		canvas.PolygonX[0] = Integer.parseInt(Xaxis2.getText());
					            	   		canvas.PolygonY[0] = Integer.parseInt(Yaxis2.getText());
					            	   		canvas.PolygonX[1] = Integer.parseInt(X2.getText());
					            	   		canvas.PolygonY[1] = Integer.parseInt(Y2.getText());
					            	   	  if (modifyCB == 1) {
						            	   		canvas.PolygonX[2] = Integer.parseInt(X3.getText());
						            	   		canvas.PolygonY[2] = Integer.parseInt(Y3.getText());}
					            	   	  else{
						            	   	canvas.PolygonX[3] = Integer.parseInt(X3.getText());
						            	   	canvas.PolygonY[3] = Integer.parseInt(Y3.getText());
							            	canvas.PolygonX[2] = canvas.PolygonX[3]+canvas.PolygonX[1]-canvas.PolygonX[0];
							            	canvas.PolygonY[2] = canvas.PolygonY[3]+canvas.PolygonY[1]-canvas.PolygonY[0];       	   		  
					            	   	  	  }
					            	   		break;
					               case 3: // if square
					            	   		canvas.height = Integer.parseInt(Xaxis2.getText());    
					            	   		break;
					               case 0: case 4:	// if straightLine or rectangle
					            	   		canvas.width = Integer.parseInt(Xaxis2.getText());
					               			canvas.height = Integer.parseInt(Yaxis2.getText());	
					            	   		break;
					               case 5: 	// if ellipse				            	   		
					            	   		canvas.width = (Integer.parseInt(Xaxis2.getText()))*2;   
					               			canvas.height = (Integer.parseInt(Yaxis2.getText()))*2;	
					            	   		break;
					               case 6:  // if circle
					            	   		canvas.height = (Integer.parseInt(Xaxis2.getText()))*2;
					            	   		break;
					            }
								break;
					}
					Xaxis2.setText(""); Yaxis2.setText(""); 
					X2.setText(""); Y2.setText(""); X3.setText(""); Y3.setText("");
					canvas.actionPerformed(e);
				}
			});
		}
		return ChangeButton;
	} // end of ChangeButton

	// represents Colors that will be changed to
	// represents a new list of colors.
	private JComboBox getNewColorCB() {
		if (NewColorCB == null) {
			NewColorCB = new JComboBox();
			NewColorCB.setVisible(false);
			NewColorCB.setBounds(new Rectangle(591, 456, 72, 20));
			NewColorCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black","Blue","Cyan","Gray","Green","Magenta","Red","Yellow" }));
		}
		return NewColorCB;
	} // end of NewColorCB 
    
	// this tools provides to learn the instance of shape by selected index of ShapeSelectCB.  
	// when we learnt the instance of shape,we set the labels and buttons which are specific to the shape to the canvas
	private JComboBox getShapeSelectCB() {
		if (ShapeSelectCB == null) {
			ShapeSelectCB = new JComboBox();
			ShapeSelectCB.setBounds(new Rectangle(575, 418, 113, 20));
			ShapeSelectCB.addItem("< Select Shape >");
			ShapeSelectCB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				if( ModifyCB.getSelectedIndex() == 2)
				{
	        	   		X2.setVisible(false);  X22Label.setVisible(false);
	        	   		X3.setVisible(false);  X32Label.setVisible(false);
	        	   		Y2.setVisible(false);  Y22Label.setVisible(false);
	        	   		Y3.setVisible(false);  Y32Label.setVisible(false);
						Xaxis2.setVisible(false);
	        	   		jLabel6.setVisible(false);

	        	   		ChangeButton.setBounds(new Rectangle(588, 491, 83, 24));
	        	   		int index = ShapeSelectCB.getSelectedIndex();
	        	   		if ( index == 0) return;
	        	   		Shape tempShape = canvas.shapes.get(index-1);
	        	   	if (tempShape instanceof LineSegment)
		        	{	
		        	   	Yaxis2.setVisible(true);
		        	   	Xaxis2.setVisible(true);
		        	   	jLabel7.setVisible(true);
		        	   	jLabel6.setVisible(true);
		        	   	jLabel6.setText("New X [end]:");
		        	   	jLabel7.setText("New Y [end]:");
		        	   	modifyCB = 0;
		        	 }
	        	   	else
		        	if (tempShape instanceof Triangle || tempShape instanceof Parallelogram)
			         {		        	   		
				       if(tempShape instanceof Triangle)
					      {modifyCB = 1;  X32Label.setText("X3 :");  Y32Label.setText(": Y3");}
					     else { modifyCB = 2;  X32Label.setText("X4 :");  Y32Label.setText(": Y4"); }
		        		ChangeButton.setBounds(new Rectangle(590, 533, 83, 24));
			           	Yaxis2.setVisible(true); 
			           	Xaxis2.setVisible(true); 
		        		jLabel6.setVisible(true);
			           	jLabel7.setVisible(true); 
		        	   	jLabel6.setText("New X1 :");
		        	   	jLabel7.setText("New Y1 :");
		        		X2.setVisible(true);  X22Label.setVisible(true);
	        	   		X3.setVisible(true);  X32Label.setVisible(true);
	        	   		Y2.setVisible(true);  Y22Label.setVisible(true); 
	        	   		Y3.setVisible(true);  Y32Label.setVisible(true);
			         }
		        	else	
	        	   	if (tempShape instanceof Square)
	        	   	{
	        	   	   Yaxis2.setVisible(false);
	        	   	   jLabel7.setVisible(false);
	        	   	   Xaxis2.setVisible(true);
			           jLabel6.setVisible(true); 
	        	   	   jLabel6.setText("Square's New Edge:"); 
	        	   	   modifyCB = 3;          	   	
	        	   	}
	        	   	else
	        	   	if (tempShape instanceof RectShape)
	        	   	{	
	        	   		Yaxis2.setVisible(true);
	        	   		Xaxis2.setVisible(true);
	        	   		jLabel7.setVisible(true);
	        	   		jLabel6.setVisible(true); 
	        	   		jLabel6.setText("New Width:");
	        	   		jLabel7.setText("New Height:");
	        	   		modifyCB = 4;
	        	   	}
	        	   	else
	        	   	if (tempShape instanceof Ellipse)
	        	   	{
	        	   		Yaxis2.setVisible(true);
	        	   		Xaxis2.setVisible(true);
	        	   		jLabel7.setVisible(true);
	        	   		jLabel6.setVisible(true);
	        	   		jLabel6.setText("@X Radius:");
	        	   		jLabel7.setText("@Y Radius:");
	        	   		modifyCB = 5;
	        	   	}
	        	   	if (tempShape instanceof Circle)
	        	   	{
	        	   	  Yaxis2.setVisible(false);
	        	   	  jLabel7.setVisible(false);
	        	   	  jLabel6.setVisible(true);
	        	   	  Xaxis2.setVisible(true);
	        	   	  jLabel6.setText("Circle's New Radius:"); 
	            	  modifyCB = 6;    
	        	   	}
				}
				}
			});
		}
		return ShapeSelectCB;
	} // end of ShapeSelectCB

	private JTextField getRHeight2() {
		if (RHeight2 == null) {
			RHeight2 = new JTextField();
			RHeight2.setBounds(new Rectangle(633, 167, 45, 17));
			RHeight2.setVisible(false);
		}
		return RHeight2;
	}

	private JTextField getRWidth2() {
		if (RWidth2 == null) {
			RWidth2 = new JTextField();
			RWidth2.setBounds(new Rectangle(633, 189, 45, 17));
			RWidth2.setVisible(false);
		}
		return RWidth2;
	}

	private JTextField getX2() {
		if (X2 == null) {
			X2 = new JTextField();
			X2.setBounds(new Rectangle(576, 484, 45, 17));
			X2.setVisible(false);
		}
		return X2;
	}

	private JTextField getY2() {
		if (Y2 == null) {
			Y2 = new JTextField();
			Y2.setBounds(new Rectangle(637, 484, 45, 17));
			Y2.setVisible(false);
		}
		return Y2;
	}

	private JTextField getX3() {
		if (X3 == null) {
			X3 = new JTextField();
			X3.setBounds(new Rectangle(576, 505, 45, 17));
			X3.setVisible(false);
		}
		return X3;
	}

	private JTextField getY3() {
		if (Y3 == null) {
			Y3 = new JTextField();
			Y3.setBounds(new Rectangle(637, 506, 45, 17));
			Y3.setVisible(false);
		}
		return Y3;
	}
}  //  @jve:decl-index=0:visual-constraint="39,6"   ~~v1.67.35.46~~ @author  Mehmet ATAR 