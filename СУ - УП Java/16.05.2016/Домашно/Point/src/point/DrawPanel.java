package point;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel; 

public class DrawPanel extends JPanel {
    private Random random = new Random();
    private Line lines[];
    private Rectangle recs[];
    
    public DrawPanel() {
        setBackground(Color.WHITE);
        lines = new Line[5];
        recs = new Rectangle[5];
        for ( int count = 0; count < lines.length; count++ ) {
            // generate random coordinates
            Point[] linesCoords = new Point[] {new Point(new int[] {random.nextInt(300),random.nextInt(300)}),
                                               new Point(new int[] {random.nextInt(300),random.nextInt(300)})};
            Point[] recCoords = new Point[] {new Point(new int[] {random.nextInt(150),random.nextInt(150)}),
                                             new Point(new int[] {random.nextInt(150)+150,random.nextInt(150)+150})};
            
            // add the line to the list of lines to be displayed same for rectangles
            lines[count] = new Line(linesCoords);
            recs[count] = new Rectangle(recCoords);
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // draw the lines
        for (Line line : lines) {
            line.draw(g);
        }
        
        // draw the rectangles
        for (Rectangle rec : recs) {
            rec.draw(g);
        }
    }

}
