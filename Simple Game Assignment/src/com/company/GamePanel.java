package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {
    private boolean []keys;
    private Image back;
    private Arkanoid mainFrame;
    private Paddle paddle1=new Paddle(100);

    public GamePanel(Arkanoid m){
        keys = new boolean[KeyEvent.KEY_LAST+1];
        back = new ImageIcon("src/OuterSpace.jpg").getImage();
        // back = Toolkit.getDefaultToolkit().getImage("yourFile.gif");
        mainFrame = m;
        setSize(814,600);
        addKeyListener(this);
    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
        mainFrame.start();
    }

    public void move(){
        if(keys[KeyEvent.VK_RIGHT] ){
            paddle1.moveRight(8);
        }
        if(keys[KeyEvent.VK_LEFT] ){
            paddle1.moveLeft(8);
        }

        Point mouse = MouseInfo.getPointerInfo().getLocation();
        Point offset = getLocationOnScreen();
        System.out.println("("+(mouse.x-offset.x)+", "+(mouse.y-offset.y)+")");
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public void paintComponent(Graphics g){
        g.drawImage(back,0,0,null);
        g.setColor(Color.blue);
        g.fillRect(paddle1.getX(),paddle1.getY(),paddle1.getW(),paddle1.getH());
    }
}