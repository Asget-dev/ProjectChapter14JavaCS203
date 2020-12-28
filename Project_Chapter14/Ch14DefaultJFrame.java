/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 14 Sample Program: Displays a default JFrame window

    File: Ch14DefaultJFrame.java

*/

import javax.swing.*;

class Ch14DefaultJFrame {

    public static void main( String[] args ) {

        JFrame defaultJFrame;

        defaultJFrame = new JFrame();

        defaultJFrame.setVisible(true);
        
        /*
        NOTE: This program does not terminate even after you close
              the jFrame window. To automatically terminate the
              program when the main JFrame window is closed, add
              the following statement. See Ch14JFrameSubclass1.       
        */
       //defaultJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}