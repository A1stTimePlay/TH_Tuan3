package Bai6;

import javax.swing.*;

public class Bai6 {
    public static void main( String[] args )
    {
        MultipleSelectionFrame multipleSelectionFrame =
                new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE );
        multipleSelectionFrame.setSize( 350, 150 ); // set frame size
        multipleSelectionFrame.setVisible( true ); // display frame
    } // end main
}
