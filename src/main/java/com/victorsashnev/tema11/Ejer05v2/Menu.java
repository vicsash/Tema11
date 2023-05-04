package com.victorsashnev.tema11.Ejer05v2;

public class Menu {

    private Invent[] invent;
    private static int counter =0 ;

    protected Menu(int NUMB){
        invent = new Invent[NUMB];
    }
    protected void addPickAxe(){
        String obj ="Pickaxe";
        //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.A);
        counter++;
    }
    protected void addSword(){
        String obj ="Sword";
        //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.A);
        counter++;
    }
    protected void addStone(){
        String obj ="Stone";
       //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.C);
        counter++;
    }
    protected void addWood(){
        String obj ="Wood";
        //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.C);
        counter++;
    }

    protected void addEgg(){
        String obj ="Egg";
        //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.B);
        counter++;
    }
    protected void addEnderPearl(){
        String obj ="Ender Pearl";
        //int numb = 1;
        invent[counter] = new Invent(obj, ItemList.Stack.B);
        counter++;
    }
    protected void removeObject(int num){
        invent[num].setStack(ItemList.Stack.D);
        invent[num].setObjectName("");
        counter--;
     }

    protected void addObject(int num, int stack,String obj){
         if(stack == 1){
             invent[num].setStack(ItemList.Stack.A);
         }else if(stack == 16){
             invent[num].setStack(ItemList.Stack.B);
         }else if(stack == 64){
             invent[num].setStack(ItemList.Stack.C);
         }
         invent[num].setObjectName(obj);
         counter++;
     }

    public String paintInvetory(){
        StringBuilder sb = new StringBuilder();
        sb.append(lines());
        sb.append("\n");
        sb.append("|");
        for (Invent s : invent) {
            sb.append(s).append("|");
        }
        sb.append("\n");
        sb.append(lines());
        return sb.toString();
    }

    protected String lines(){
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for (Invent value : invent) {
            try {
                len = value.getObjectName().length();
            }catch (NullPointerException npe){
                sb.append("--");
            }
            sb.append("--".repeat(len));
        }
        return sb.toString();
    }
}
