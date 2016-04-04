package graphicapp;

import javax.swing.JFrame;

public class GraphicAppTest {
    public static void main(String[] args) {
        GraphicApp panel = new GraphicApp();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
}
