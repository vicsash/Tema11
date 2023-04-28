package com.victorsashnev.tema11.Ejer05;

public class Objects {
    public enum Stack{
        A(1),B(16),C(64),D(0);
        private final int value;

        Stack(int i) {
            value = i;
        }
        public int getValue(){return  value;}}

    private final String objectName;

    private final Stack stack;

    public String getObjectName() {
        return objectName;
    }

    public Stack getStack() {
        return stack;
    }

    public Objects(String objectName, Stack stack) {
        this.objectName = objectName;
        this.stack = stack;
    }

    @Override
    public String toString() {
        if(stack.getValue() ==0 || getObjectName().isEmpty()){
            return "Objects{" +
                    ""+
                    '}';
        }
        if(stack.getValue()==1){
            return "Objects{" +
                    "objectName='" + objectName + '\'' +
                    '}';
        }else
            return "Objects{" +
                    "objectName='" + objectName + '\'' + stack +
                    '}';
    }
}

