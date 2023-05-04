package com.victorsashnev.tema11.Ejer05v2;

public class Invent extends ItemList {


    private final String item;
    private final int stack;

    public String getItem() {
        return item;
    }

    public int getStack() {
        return stack;
    }

    public Invent(String item, int stack) {
        this.item = item;
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Invent{" +
                "item='" + item + '\'' +
                ", stack=" + stack +
                '}';
    }
}

