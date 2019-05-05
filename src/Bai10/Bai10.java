package Bai10;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Bai10 {
    static public class ShapesJPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;

            g2d.fillRect(30, 20, 50, 50);
            g2d.fillRect(120, 20, 90, 60);
            g2d.fillRoundRect(250, 20, 70, 60, 25, 25);

            g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
            g2d.fillArc(120, 130, 110, 100, 5, 150);
            g2d.fillOval(270, 130, 50, 50);
        }
    }

    static public void main(String[] args){
        JFrame frame = new JFrame( "Bai 10" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        ShapesJPanel shapesJPanel = new ShapesJPanel();
        frame.add( shapesJPanel );
        frame.setSize( 500, 500 );
        frame.setVisible( true );
    }
}
