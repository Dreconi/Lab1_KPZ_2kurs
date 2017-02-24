package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        DrawSquare square = new DrawSquare();
        JFrame frame = new JFrame("Лабораторна робота №1, частина 1");
        frame.setSize(400,500);
        JPanel panel = new JPanel();
        frame.add(square);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        square.start(frame);

    }
}
