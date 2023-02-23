package com.jaclock.main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[])
    {
        JFrame window = new JFrame("Java Wall Clock");
        Color c = new Color(118, 73, 190);
        window.setBackground(Color.YELLOW);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0, 0, 400, 400);
        Clock clock = new Clock();
        window.getContentPane().add(clock);
        window.setLocationRelativeTo(null);
        window.setResizable(true);
        window.setVisible(true);
        clock.start();
    }
}