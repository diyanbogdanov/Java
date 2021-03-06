package binaryarray;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BinaryArrayTest extends JFrame implements ActionListener {
    
    JLabel enterLabel, resultLabel, infoLabel;
    JTextField enterField, resultField, infoText;
    BinaryArray searchArray;

    public static void main(String args[]) {
        BinaryArrayTest app = new BinaryArrayTest();
        app.setSize(300, 120);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    } // end main
    
    public BinaryArrayTest() {
        super("Binary Search");
        // create a LinearSearch object with an array of 10 elements
        searchArray = new BinaryArray(10);
        setLayout(new FlowLayout());
        infoLabel = new JLabel("The array:");
        add(infoLabel);

        infoText = new JTextField(18);
        infoText.setEditable(false);
        // print array
        add(infoText);
        infoText.setText(searchArray.toString());

        enterLabel = new JLabel("Enter integer search key");
        add(enterLabel);

        enterField = new JTextField(10);
        add(enterField);

        // register this applet as enterField's action listener
        enterField.addActionListener(this);

        // set up JLabel and JTextField for displaying results
        resultLabel = new JLabel("Result");
        add(resultLabel);

        resultField = new JTextField(20);
        resultField.setEditable(false);
        add(resultField);
    } // end LinearArrayTest
    
    public void actionPerformed(ActionEvent actionEvent) {
        int searchInt; // search key
        String element; // location of search key in array

        // input also can be obtained with enterField.getText()
        String searchKey = enterField.getText(); //actionEvent.getActionCommand();
        searchInt = Integer.parseInt(searchKey);

        // perform linear search
        element = searchArray.binarySearchAll(searchInt);
        // display search result
        resultField.setText(element);
    }
}
