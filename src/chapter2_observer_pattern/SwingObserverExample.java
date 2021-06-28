package chapter2_observer_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setVisible(true);
    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Yes! Go Ahead! you can do anything :) ");
        }
    }

    class DevilListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Over think about what will happen,if this goes wrong!");
        }
    }

}
