package com.victorsashnev.tema11.Ejer05v2;

public class Invent extends ItemList {


        private String objectName;

        private ItemList.Stack stack;

        public String getObjectName() {
            return objectName;
        }

        public ItemList.Stack getStack() {
            return stack;
        }



        public void setObjectName(String objectName) {
            this.objectName = objectName;
        }

        public void setStack(ItemList.Stack stack) {
            this.stack = stack;
        }


    }
}
