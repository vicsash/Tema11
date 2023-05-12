package com.victorsashnev.tema11.Ejer07;

import java.util.GregorianCalendar;

public class Stadium {




        private final int price = 5;
        private  Match[] match;
        private final int MAXMATCHES =20;


        public Stadium(){

            match = new Match[MAXMATCHES];
        }
}
