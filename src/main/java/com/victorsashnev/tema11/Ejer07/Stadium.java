package com.victorsashnev.tema11.Ejer07;

import java.util.GregorianCalendar;

public class Stadium {



        protected static final int CAPACITYPERZONE = 5;
        private final int price = 5;
        private  Match match;
        private Zone[] zone;


        public Stadium(){
            zone = new Zone[CAPACITYPERZONE];
            match = new Match();
        }
}
