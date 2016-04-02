package computeminperimeter;

import javax.swing.JOptionPane;

public class ComputeMinPerimeter {

    public static void main(String[] args) {
        double degreeAOP;
        double degreeAOL;
        double lengthOL;
        double minimumPerimeter;
        double sideLF;
        double sideLQ;

        degreeAOP = Double.parseDouble(JOptionPane.showInputDialog("Please enter degrees of angle AOP: "));
        degreeAOL = Double.parseDouble(JOptionPane.showInputDialog("Please enter degrees of angle AOL: "));
        lengthOL = Double.parseDouble(JOptionPane.showInputDialog("Please enter length of OL: "));
        
        sideLF = 2 * lengthOL * Math.sin( Math.toRadians(degreeAOL) );
        sideLQ = 2 * lengthOL * Math.sin( Math.toRadians(degreeAOP - degreeAOL) );
        
        minimumPerimeter = Math.sqrt( Math.pow(sideLQ, 2) + Math.pow(sideLF, 2) - 2 * sideLF * sideLQ * Math.cos(Math.toRadians(180 - degreeAOP)));
        //minimumPerimeter = 2 * lengthOL * Math.sin(Math.toRadians(degreeAOP));
        
        JOptionPane.showMessageDialog(null, "The minimum perimeter is: " + minimumPerimeter);
    }

}
