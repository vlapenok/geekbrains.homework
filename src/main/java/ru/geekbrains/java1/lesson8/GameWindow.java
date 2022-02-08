package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
1. Сделать кнопку перезапуска игры, приложение должно загадать новое число и написать пользователю, что игра началась.
2. Заблокировать кнопки, которые уже были нажаты.
3. Добавить три попытки на отгадывание.
 */

public class GameWindow extends JFrame {
    private int random;
    private JTextField textField;
    private Font font;
    private JPanel buttonsPanel;
    private JPanel restartPanel;
    private int count = 0;
    private Button[] button = new Button[10];

    public GameWindow() {
        font = new Font("Arial",Font.PLAIN,20);
        random = (int) (Math.random() * 10) + 1;

        setTitle("Игра угадай число");
        setBounds(600, 400, 400, 120);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        initTextField();
        initButtonsPanel();
        initRestartPanel();

        setVisible(true);
    }

    private void initTextField() {
        textField = new JTextField("Игра угадай число");
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(font);
        textField.setEditable(false);
        add(textField, BorderLayout.CENTER);
    }

    private void initButtonsPanel() {
        buttonsPanel = new JPanel(new GridLayout(1, 10));
        for (int i = 0; i < 10; i++) {
            button[i] = new Button(String.valueOf(i + 1));
            button[i].setFont(font);
            buttonsPanel.add(button[i]);
            int finalI = i;
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(Integer.parseInt(button[finalI].getLabel()), button[finalI]);
                }
            });
        }
        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initRestartPanel() {
        restartPanel = new JPanel(new GridLayout(1, 2));
        JButton buttonRestart = new JButton("Restart");
        JButton buttonExit = new JButton("Exit");
        buttonRestart.setFont(font);
        buttonExit.setFont(font);
        restartPanel.add(buttonRestart);
        restartPanel.add(buttonExit);

        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                random = (int) (Math.random() * 10) + 1;
                remove(restartPanel);
                for (Button b : button) {
                    b.setEnabled(true);
                }
                add(buttonsPanel, BorderLayout.SOUTH);
                buttonsPanel.revalidate();
                textField.setText("Игра угадай число");
                count = 0;
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void tryToAnswer(int num, Button b) {
        if(random == num || count == 2) {
            textField.setText(random == num ? "WIN!!!" : "Попытки закончились");
            remove(buttonsPanel);
            add(restartPanel, BorderLayout.SOUTH);
            restartPanel.revalidate();
        } else if(random > num) {
            count++;
            textField.setText("Загаданное число больше, чем " + (num));
            b.setEnabled(false);
        } else {
            count++;
            textField.setText("Загаданное число меньше, чем " + (num));
            b.setEnabled(false);
        }
    }
}
