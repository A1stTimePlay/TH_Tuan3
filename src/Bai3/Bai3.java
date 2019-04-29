package Bai3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai3 {
    static public void main(String[] args){
        JFrame frame= new JFrame("Bai 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,600,150);

        JTextArea jTextArea1= new JTextArea(3,20);
        JTextArea jTextArea2= new JTextArea(3,20);
        JButton jButton= new JButton("Click me");

        FlowLayout layout= new FlowLayout();
        frame.setLayout(layout);
        frame.add(jTextArea1);
        frame.add(jButton);
        frame.add(jTextArea2);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea2.setText(jTextArea1.getText());
            }
        });
        frame.setVisible(true);

    }
}
