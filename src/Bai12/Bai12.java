package Bai12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bai12 {

    public Bai12() {
        createAndShowGui();
    }

    private void createAndShowGui() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        final Circle circle = new Circle(10, 10, 50,50, Color.RED);

        JSlider jslider = new JSlider();
        jslider.setValue(50);
        jslider.setMaximum(250);
        jslider.setMinorTickSpacing(5);
        jslider.setMajorTickSpacing(10);
        jslider.setPaintTicks(true);
        jslider.setPaintLabels(true);

        jslider.setLabelTable(jslider.createStandardLabels(50));

        final JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);

                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

                circle.draw(g2d);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 300);
            }
        };

        jslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                JSlider slider = (JSlider) ce.getSource();

                if (!slider.getValueIsAdjusting()) {
                    int newW = slider.getValue();
                    int newH = slider.getValue();

                    circle.setWidth(newW);
                    circle.setHeight(newH);

                    System.out.println(newW + "," + newH);

                    panel.repaint();
                }
            }
        });

        frame.add(jslider, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Bai12 test = new Bai12();
    }
}

class Circle {

    private int x, y, width, height;
    private final Color color;

    public Circle(int x, int y, int w, int h, Color color) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.color = color;
    }

    void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.drawOval(x, y, width, height);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
