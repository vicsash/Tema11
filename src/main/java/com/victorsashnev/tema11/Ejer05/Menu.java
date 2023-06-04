package com.victorsashnev.tema11.Ejer05;

public class Menu {

    private Invent[] invent;
    private static int counter =0 ;

    protected Menu(int NUMB){
        invent = new Invent[NUMB];
    }
    protected void addPickAxe(){
        String obj ="Pickaxe";

        invent[counter] = new  Invent(obj, Objects.Stack.A);
        counter++;
    }
    protected void addSword(){
        String obj ="Sword";
        invent[counter] = new  Invent(obj, Objects.Stack.A);
        counter++;
    }
    protected void addStone(){
        String obj ="Stone";
        invent[counter] = new  Invent(obj, Objects.Stack.C);
        counter++;
    }
    protected void addWood(){
        String obj ="Wood";
        invent[counter] = new  Invent(obj, Objects.Stack.C);
        counter++;
    }

    protected void addEgg(){
        String obj ="Egg";
        invent[counter] = new  Invent(obj, Objects.Stack.B);
        counter++;
    }
    protected void addEnderPearl(){
        String obj ="Ender Pearl";
        invent[counter] = new  Invent(obj, Objects.Stack.B);
        counter++;
    }

    /**
     * Remove an object
     * @param num
     * @return
     */
    protected int removeObject(int num){
        if(invent[num].getObjectName().isEmpty())
            return 0;
        invent[num].setStack(Objects.Stack.D);
        invent[num].setObjectName("");
        counter--;
        return 1;
     }

    /**
     * Add an object
     * @param num
     * @param stack
     * @param obj
     * @return
     */
    protected int addObject(int num, int stack,String obj){
        if(!(invent[num].getObjectName().isEmpty()))
            return 0;
         if(stack == 1){
             invent[num].setStack(Objects.Stack.A);
             invent[num].setObjectName(obj);
         }else if(stack == 16){
             invent[num].setStack(Objects.Stack.B);
             invent[num].setObjectName(obj);
         }else if(stack == 64){
             invent[num].setStack(Objects.Stack.C);
             invent[num].setObjectName(obj);
         } else if(stack ==0){
             return 0;
         }else
             return 0;

         counter++;
         return 1;
     }

    /**
     * Show/paint incentory
     * @return
     */
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

    /**
     * lines to best simulate the upper and bottom line of box
     * @return
     */
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
