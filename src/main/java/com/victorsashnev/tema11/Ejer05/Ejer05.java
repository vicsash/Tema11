package com.victorsashnev.tema11.Ejer05;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ejer05 {
    public Ejer05(){

        String[] inventory = new String[7];
        System.out.println(paintInvetory(inventory));


    }


    public String paintInvetory(String[]inv){
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(inv.length*5)).append("\n");
        sb.append("|");
        for (String s : inv) {
            sb.append(s).append("|");
        }
        sb.append("\n").append("\n").append("-".repeat(inv.length*5));
        return sb.toString();
    }
}
