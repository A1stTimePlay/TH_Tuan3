package Bai2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bai2 {
    static public void main(String[] args){
        JFrame frame= new JFrame("Bai 2");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JLabel Info = new JLabel("Key pressed: ");

        panel.add(Info);
        panel.add(label);

        frame.setContentPane(panel);
        frame.setBounds(50, 20 , 200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                String temp=Character.toString(e.getKeyChar());
                label.setText(temp);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
