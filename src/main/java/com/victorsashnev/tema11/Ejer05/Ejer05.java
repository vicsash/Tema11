package com.victorsashnev.tema11.Ejer05;
import com.victorsashnev.tema11.LibMenu;
import com.victorsashnev.tema11.LibMethods;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.awt.*;
import java.util.ArrayList;

public class Ejer05 {
    public Ejer05(){
        int opt1;
        final int SPACES = 7;
        String[] inventory = new String[SPACES];
        System.out.println(paintInvetory(inventory));
        Menu menu = new Menu(SPACES);
        menu.addPickAxe();
        menu.addStone();
        menu.addSword();
        menu.addWood();
        menu.addEnderPearl();
        menu.addEgg();
        do{
            Menu();
            opt1 = LibMethods.scanInt();
            switch( opt1){

                case 1:
                    break;

                case 2:
                    break;

                case 3:

                case 0:
                    break;
                default:
                    System.out.println("Dato incorrecto");
                    break;

            }

        }while( opt1 != 0);


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

    public String Menu(){
        StringBuilder sb = new StringBuilder();
        return  sb.toString();
    }


}
