package Bai9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Bai9 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Bai 7");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField("", 25);
        Font plainFont = new Font("Serif", Font.PLAIN, 14);
        Font boldFont = new Font("Serif", Font.BOLD, 14);
        Font italicFont= new Font("Serif", Font.ITALIC, 14);
        Font boldItalicFont= new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        ButtonGroup radioGroup= new ButtonGroup();
        JRadioButton plainJRadioButton = new JRadioButton("Pain", true);
        JRadioButton boldJRadioButton = new JRadioButton("Bold", false);
        JRadioButton italicJRadioButton = new JRadioButton("Italic", false);
        JRadioButton boldItalicJRadioButton = new JRadioButton("Bold + Italic", false);
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        class RadioByttonHandler implements ItemListener{
            private Font font;
            public RadioByttonHandler(Font f){
                this.font= f;
            }

            @Override
            public void itemStateChanged(ItemEvent e) {
                textField.setFont(font);
            }
        }

        plainJRadioButton.addItemListener(new RadioByttonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioByttonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioByttonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioByttonHandler(boldItalicFont));

        panel.setLayout(new FlowLayout());
        panel.add(textField);
        panel.add(plainJRadioButton);
        panel.add(boldJRadioButton);
        panel.add(italicJRadioButton);
        panel.add(boldItalicJRadioButton);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
