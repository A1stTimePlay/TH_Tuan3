package Bai1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai1 {
    static public void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel= new JPanel();
        JButton btnButton= new JButton("Click me");
        JTextField tfTextield = new JTextField("",15);
        JLabel lbLabel= new JLabel();

        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text= tfTextield.getText();
                lbLabel.setText("Xin chao "+ text);
            }
        });

        panel.add(tfTextield);
        panel.add(btnButton);
        panel.add(lbLabel);
        frame.setContentPane(panel);
        frame.setBounds(50,50, 500, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
