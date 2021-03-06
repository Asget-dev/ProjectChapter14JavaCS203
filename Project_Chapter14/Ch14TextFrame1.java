/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: Displays a frame with two buttons,
                              and one text field

    File: Ch14TextFrame1.java

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *  Ch14TextFrame1 class
 *
 * <p>
 * A sample frame to illustrate the placing of GUI objects and event handling
 * with the Swing JFrame.
 */
class Ch14TextFrame1 extends JFrame implements ActionListener {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 300;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 200;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * The Swing button for Cancel
     */
    private JButton cancelButton;


    /**
     * The Swing button for OK
     */
    private JButton okButton;

    /**
     * The JTextField for the user to enter a text
     */
    private JTextField inputLine;



//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14TextFrame1 frame = new Ch14TextFrame1();
        frame.setVisible(true);
    }


//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Ch14TextFrame1() {
        Container contentPane;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program Ch14TextFrame1");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout());

        //add the text field
        inputLine = new JTextField();
        inputLine.setColumns(22);
       // inputLine.setFont(new Font("Courier", Font.PLAIN, 14));
        contentPane.add(inputLine);

        inputLine.addActionListener(this);
        
        
        //create and place two buttons on the frame
        okButton = new JButton("OK");
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);

        //register this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

//-------------------------------------------------
//      Public Methods:
//
//          void    actionPerformed   (   ActionEvent        )
//
//------------------------------------------------

    /**
     * Standard method to respond the action event.
     *
     * @param event the ActionEvent object
     *
     */
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();

            String  buttonText = clickedButton.getText();

            setTitle("You clicked " + buttonText);

        } else { //the event source is inputLine
            setTitle("You entered '" + inputLine.getText() + "'");
        }
    }

}