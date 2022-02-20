package ru.geekbrains.java1.lesson8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame{
    private JPanel menuPanel = new JPanel();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JButton button1 = new JButton("Show Panel 1");
    private JButton button2 = new JButton("Show Panel 2");
    private JButton button3 = new JButton("Show Panel 3");
    private JPanel currentPanel = panel1;

    public Window() {
        super.setTitle("Window");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        menuPanel.setLayout(new FlowLayout());
        menuPanel.add(button1);
        menuPanel.add(button2);
        menuPanel.add(button3);

        panel1.setBackground(new Color(0xAA, 0xAA, 0xAA));
        panel2.setBackground(new Color(0xBB, 0xBB, 0xBB));
        panel3.setBackground(new Color(0xCC, 0xCC, 0xCC));

        panel1.add(new JLabel("Panel 1"));
        panel2.add(new JLabel("Panel 2"));
        panel3.add(new JLabel("Panel 3"));

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(menuPanel, BorderLayout.NORTH);
        this.getContentPane().add(panel1, BorderLayout.CENTER);

        button1.addActionListener(this::buttonClick);
        button2.addActionListener(this::buttonClick);
        button3.addActionListener(this::buttonClick);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }

    private void buttonClick(ActionEvent e){
        this.getContentPane().remove(currentPanel);

        if (e.getSource().equals(button1)) {
            this.getContentPane().add(panel1, BorderLayout.CENTER);
            currentPanel = panel1;
        }
        else {
            if (e.getSource().equals(button2)) {
                this.getContentPane().add(panel2, BorderLayout.CENTER);
                currentPanel = panel2;
            }
            else {
                this.getContentPane().add(panel3, BorderLayout.CENTER);
                currentPanel = panel3;
            }
        }
        currentPanel.revalidate();
        this.repaint();
    }
}
