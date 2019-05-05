package Bai13;

import javax.swing.*;

public class Bai13 {
    static public void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(300, 200);
        JMenuBar mb= new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu formatMenu = new JMenu("Format");
        JMenuItem fileAbout= new JMenuItem("About");
        JMenuItem fileExit = new JMenuItem("Exit");

        mb.add(fileMenu);
        mb.add(formatMenu);
        f.setJMenuBar(mb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
