package com.victorsashnev.tema11.Ejer05;

public class Menu {

    private final Invent[] invent;
    private static int counter =0 ;

    protected Menu(int NUMB){
        invent = new Invent[NUMB];
    }
    protected void addPickAxe(){
        String obj ="Pickaxe";
        //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.A);
        counter++;
    }
    protected void addSword(){
        String obj ="Sword";
        //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.A);
        counter++;
    }
    protected void addStone(){
        String obj ="Stone";
       //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.C);
        counter++;
    }
    protected void addWood(){
        String obj ="Wood";
        //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.C);
        counter++;
    }

    protected void addEgg(){
        String obj ="Egg";
        //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.B);
        counter++;
    }
    protected void addEnderPearl(){
        String obj ="Ender Pearl";
        //int numb = 1;
        invent[counter] = new  Invent(obj, Objects.Stack.B);
        counter++;
    }
    protected void removeObject(int num){
        invent[num].setStack(Objects.Stack.D);
        invent[num].setObjectName("");
        counter--;
     }

    protected void addObject(int num, int stack,String obj){
         if(stack == 1){
             invent[num].setStack(Objects.Stack.A);
         }else if(stack == 16){
             invent[num].setStack(Objects.Stack.B);
         }else if(stack == 64){
             invent[num].setStack(Objects.Stack.C);
         }
         invent[num].setObjectName(obj);
         counter++;
     }
}
