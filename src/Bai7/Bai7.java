package Bai7;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Bai7 extends JFrame {
    private JList colorJList;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW};

    public Bai7() {
        super("Bai 7");
        setLayout(new FlowLayout());
        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);

        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(
                                colors[colorJList.getSelectedIndex()]);
                    }
                }
        );
    }

    public static void main(String[] args) {
        Bai7 listFrame = new Bai7();
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(350, 150);
        listFrame.setVisible(true);
    }
}
