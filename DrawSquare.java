package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException.*;

/**
 * Created by Dreconi on 17.02.2017.
 */
public class DrawSquare extends JPanel {
    int x=10, y=10, addX=1, addY=1;

    public void paint(Graphics g) {
        Color color = new Color(45, 115, 114);
        g.setColor(color);
        g.fillRect(x, y, 50, 50);

    }
    public void start(JFrame mainWindow) {
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextStep(mainWindow);
            }
        });
        timer.start();
    }

    void nextStep(JFrame mainWindow)
    {
        if (x+50 > mainWindow.getContentPane().getWidth())
        {
            addX = -1;
        }
        if (x < 0)
        {
            addX = 1;
        }
        if (y+50 > mainWindow.getContentPane().getHeight())
        {
            addY = -1;
        }
        if (y < 0)
        {
            addY = 1;
        }
        x+=addX;
        y+=addY;
        mainWindow.repaint();
        repaint();

    }

}