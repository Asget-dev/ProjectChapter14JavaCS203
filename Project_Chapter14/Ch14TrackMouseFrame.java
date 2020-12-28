/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: Tracks the mouse movement

    File: Ch14TrackMouseFrame.java

*/

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

/**
 *   Ch14TrackMouseFrame
 *
 *   This program tracks the mouse click events. When a mouse button (any
 *   mouse button supported by the platform) is clicked, the
 *   location where the mouse button is clicked is displayed.
 */
class Ch14TrackMouseFrame extends JFrame implements MouseListener {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Default frame width
     */
    private static final int FRAME_WIDTH    = 450;

    /**
     * Default frame height
     */
    private static final int FRAME_HEIGHT   = 300;

    /**
     * X coordinate of the frame default origin point
     */
    private static final int FRAME_X_ORIGIN = 150;

    /**
     * Y coordinate of the frame default origin point
     */
    private static final int FRAME_Y_ORIGIN = 250;

    /**
     * Constant for mouse button double click
     */
    private static final int DOUBLE_CLICK = 2;


//----------------------------------
//      Main method
//----------------------------------
    public static void main(String[] args) {
        Ch14TrackMouseFrame frame = new Ch14TrackMouseFrame();
        frame.setVisible(true);
    }


//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Ch14TrackMouseFrame() {
        //set frame properties
        setTitle     ("TrackMouseFrame");
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //to change the background color, do
        //setBackground(Color.white);
        //((JPanel)getContentPane()).setOpaque(false);
        // or
        // ((JPanel)getContentPane()).setBackground(Color.white);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //register self as a mouse event listener
        addMouseListener( this );
    }

//-------------------------------------------------
//      Public Methods:
//
//          void    mouseClicked   (   MouseEvent   )
//
//          void    start          (                )
//
//------------------------------------------------

    public void mouseClicked(MouseEvent event)
    {
        if (event.getClickCount() == DOUBLE_CLICK) {
           System.exit(0);

        } else {
           int x, y;

           x = event.getX(); //get the x and y coordinates of
           y = event.getY(); //the mouse click point

           System.out.println("[" + x + "," + y + "]");
        }
    }

    public void mouseEntered   ( MouseEvent event ) { }
    public void mouseExited    ( MouseEvent event ) { }
    public void mousePressed   ( MouseEvent event ) {
    	System.out.println("Down");
    }
    public void mouseReleased  ( MouseEvent event ) {
    	System.out.println("Up");
    }


}