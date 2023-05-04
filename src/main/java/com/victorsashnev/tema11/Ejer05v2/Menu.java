package com.victorsashnev.tema11.Ejer05v2;

public class Menu {

    private final Invent[] invent;
    private static int counter =0 ;

    protected Menu(int NUMB){
        invent = new Invent[NUMB];
    }



    public void addItem(int num , String itm){
        //if(itm.equalsIgnoreCase())
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
                len = value.getItem().length();
            }catch (NullPointerException npe){
                sb.append("--");
            }
            sb.append("--".repeat(len));
        }
        return sb.toString();
    }
}
