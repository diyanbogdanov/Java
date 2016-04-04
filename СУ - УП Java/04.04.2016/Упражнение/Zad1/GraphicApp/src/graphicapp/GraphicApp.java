package graphicapp;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicApp extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int windowH;
        int windowW;
        
        windowH = getHeight();
        windowW = getWidth();
        
        g.drawOval(0 , 0, windowW, windowH);
        g.drawLine(windowW / 2, 0, 0, windowH / 2);
        g.drawLine(windowW / 2, 0, windowW, windowH / 2);
        g.drawLine(0, windowH / 2, windowW, windowH / 2);
    }
}
