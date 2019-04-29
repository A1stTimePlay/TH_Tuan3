package Bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai4 {
    static public void main (String[] args){
        JFrame frame = new JFrame();
        frame.setBounds(0,0,500,150);
        frame.setDefaultCloseOperation(3);
        JButton buttonLeft= new JButton("Left");
        JButton buttonCenter= new JButton("Center");
        JButton buttonRight = new JButton("Right");

        JPanel panel=new JPanel();
        panel.add(buttonLeft);
        panel.add(buttonCenter);
        panel.add(buttonRight);

        frame.setContentPane(panel);

        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel leftPanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
                leftPanel.add(buttonLeft);
                leftPanel.add(buttonCenter);
                leftPanel.add(buttonRight);
                frame.setContentPane(leftPanel);
                frame.setVisible(true);
            }
        });

        buttonCenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                centerPanel.add(buttonLeft);
                centerPanel.add(buttonCenter);
                centerPanel.add(buttonRight);
                frame.setContentPane(centerPanel);
                frame.setVisible(true);
            }
        });

        buttonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                rightPanel.add(buttonLeft);
                rightPanel.add(buttonCenter);
                rightPanel.add(buttonRight);
                frame.setContentPane(rightPanel);
                frame.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}
