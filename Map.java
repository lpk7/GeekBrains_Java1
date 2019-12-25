package ru.geekbrains.java_one.lesson_g.practice;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    Map() {
        setBackground(Color.BLUE);
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        setBackground(Color.RED);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(new GridLayout(fieldSizeX, fieldSizeX));
        for (int i = 0; i < fieldSizeX * fieldSizeX; i++) {
            JButton btn = new JButton();
            add(btn);
        }
        System.out.printf("mode = %d\nfsX = %d\nwin = %d", gameMode, fieldSizeX, winLength);
    }
}