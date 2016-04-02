package drawpanel;
// Fig. 4.19: DrawPanel.java
// Draws two crossing lines on a panel.

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    // draws an X from the corners of the panel

    public void paintComponent(Graphics g) {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
  
        int height = getHeight(); // total height
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = height;
        
        int x3 = 0;
        int y3 = 0;
        int x4 = height;
        int y4 = 0;

        while (y1 < height) { 
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(y1, x1, y2, x2);
            x2 += 15;
            y1 += 15;
        }
        
        while (y3 < height) {
            g.drawLine(x3, y3, x4, y4);
            g.drawLine(y3, height, height, x4);
            x4 -= 15;
            y3 += 15;
        }

    } // end method paintComponent

} // end class DrawPanel

