package com.victorsashnev.tema11.Ejer07;

import java.util.GregorianCalendar;

public class Match {
    //enum here and price as well maybe
    private GregorianCalendar dateOfGame;
    private final String homeTeam;
    private final String visitTeam;

    private  Zone zone;
    public Match(){
        zone = new Zone();
    }
}
