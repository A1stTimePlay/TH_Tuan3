package Bai8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bai8 {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public Bai8(){
        prepareGUI();
    }

    public static void main(String[] args){
        Bai8  swingControlDemo = new Bai8();
        swingControlDemo.showFileChooserDemo();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Bai 8");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        statusLabel = new JLabel("",JLabel.CENTER);

        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showFileChooserDemo(){

        final JFileChooser  fileDialog = new JFileChooser();
        JButton showFileDialogButton = new JButton("Open File");
        showFileDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileDialog.showOpenDialog(mainFrame);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    java.io.File file = fileDialog.getSelectedFile();
                    ImageIcon image = new ImageIcon(file.getPath());
                    statusLabel.setIcon(image);
                }
                else{
                    statusLabel.setText("Open command cancelled by user." );
                }
            }
        });
        controlPanel.add(showFileDialogButton);
        mainFrame.setVisible(true);
    }
}
