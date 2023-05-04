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
        Menu menu = new Menu(SPACES);
        menu.addPickAxe();
        menu.addStone();
        menu.addSword();
        menu.addWood();
        menu.addEnderPearl();
        menu.addEgg();
        String item;
        int slotNum,stacknum;
        do{
            System.out.println("1-Add item");
            System.out.println("2-Remove item");
            System.out.println("3-Show inventory");
            System.out.println("0-Exit");
            opt1 = LibMethods.scanInt();

            switch( opt1){

                case 1:
                    System.out.println("Introduce item name");
                    item = LibMethods.scanString();
                    System.out.println("Introduce slot number");
                    slotNum = LibMethods.scanInt();
                    System.out.println("Introduce if its 1,12 or 64");
                    stacknum = LibMethods.scanInt();
                    if((menu.addObject(slotNum,stacknum,item) ==1))
                    System.out.println("Object added");
                    else
                        System.out.println("Error");
                    break;
                case 2:
                    if((menu.removeObject(1) ==1))
                        System.out.println("Object removed");
                    else
                        System.out.println("Error");
                    break;
                case 3:
                    System.out.println(menu.paintInvetory());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Dato incorrecto");
                    break;

            }

        }while( opt1 != 0);


    }

}
