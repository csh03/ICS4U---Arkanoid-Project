package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.MouseInfo;

public class Arkanoid extends JFrame implements ActionListener{
    Timer myTimer;
    GamePanel game;

    public Arkanoid() {
        super("Arkanoid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(814,638);

        myTimer = new Timer(10, this);	 // trigger every 10 ms

        game = new GamePanel(this);
        add(game);

        setResizable(false);
        setVisible(true);
    }

    public void start(){
        myTimer.start();
    }

    public void actionPerformed(ActionEvent evt){
        game.move();
        game.repaint();
    }

    public static void main(String[] arguments) {
        Arkanoid frame = new Arkanoid();
    }
}
