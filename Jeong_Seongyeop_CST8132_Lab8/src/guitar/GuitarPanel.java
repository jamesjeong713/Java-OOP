package guitar;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * This class is to play wire whenever user drag mouse in each wire.
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public class GuitarPanel extends JPanel 
{

	int previousY = 0;
	int currentY = 0;
	Guitar guitar = new Guitar();
	
	/**
	 *  Load image file return the runtime class of the object with guitar.jpg  	 
	 */
	private Image img = new ImageIcon(getClass().getResource("/guitar.jpg")).getImage();
	// each array direct y coordinate.
	private int[] y = {0,408,381,356,327,300,272};

   // set up GUI and register mouse event handler
   public GuitarPanel()
   {

      // handle frame mouse motion event
      addMouseMotionListener(

         new MouseMotionAdapter() // anonymous inner class
         {
        	 /**
        	  * it occurs when the mouse position changes.
        	  * to avoid overlapped values with current and previous values.
        	  * if it is not declared previouseY separately, previouseY value is same with currentY
        	  * when it is plucked. therefore, the wire will not be played
        	  */
        	 public void mouseMoved( MouseEvent event )
        	 {
        		 previousY = event.getY();
        	 }
        	 /**
        	  * store drag coordinates and repaint
        	  * @MouseEvent swing component about mouse action
        	  */
            public void mouseDragged( MouseEvent event )
            {
            	// whenever mouse is pressed and dragged, 
            	// y coordinate will return to currentY
            	currentY = event.getY();

            	// to check 6 times (because of 6 wires)
            	for(int i = 6; i > 0; i--)
            	{
        			// pluck wire if the condition is satisfied.
            		// then, previousY coordinate will be currentY to update previous wire which is played.
            		if(previousY < y[i] && currentY >= y[i] || previousY > y[i] && currentY <= y[i])
        			{
    					guitar.pluck(i);
        			} // end if clause
            	} // end for loop
        	    previousY = currentY;
             } // end method mouseDragged
         } // end anonymous inner class
      ); // end call to addMouseMotionListener
   } // end PaintPanel constructor

   // draw ovals in a 4-by-4 bounding box at specified locations on window
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // clears drawing area
      g.drawImage(img,0,0,null);
   } // end method paintComponent
} // end class PaintPanel


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
