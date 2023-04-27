package com.victorsashnev.tema11.Ejer05;

import javax.swing.*;
import java.awt.*;

public class Ejer05 {
    public Ejer05(){

        String [] invetory = new String[7];

        JFrame display = new JFrame();
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setSize(500,500);
        display.setLayout(new FlowLayout(FlowLayout.CENTER));

        for(int i = 0 ; i < invetory.length;i++){
            display.add(new JButton(invetory[i]));
        }
    }
}
