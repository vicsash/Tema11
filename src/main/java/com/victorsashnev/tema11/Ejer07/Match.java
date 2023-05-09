package com.victorsashnev.tema11.Ejer07;

import java.util.GregorianCalendar;

public class Match {
    private GregorianCalendar dateOfGame;

    private final String homeTeam;
    private final String visitTeam;

    public GregorianCalendar getDateOfGame() {
        return dateOfGame;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public Match(GregorianCalendar dateOfGame, String homeTeam, String visitTeam) {
        this.dateOfGame = dateOfGame;
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
    }

    @Override
    public String toString() {
        return "Match{" +
                "dateOfGame=" + dateOfGame +
                ", homeTeam='" + homeTeam + '\'' +
                ", visitTeam='" + visitTeam + '\'' +
                '}';
    }
}
