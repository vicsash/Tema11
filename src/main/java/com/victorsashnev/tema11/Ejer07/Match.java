package com.victorsashnev.tema11.Ejer07;

import java.util.GregorianCalendar;

public class Match {
    public enum INFLUXPRICE {
        LOW_INFLUX(0.75), MEDIUM_INFLUX(1), HIGH_INFLUX(1.3);
        private final double value;

        INFLUXPRICE(double i) {
            value = i;
        }

        public double getValue() {
            return value;
        }
    }
    private int matchId;
    private int cont = 0;
    private  INFLUXPRICE influxprice;
    private GregorianCalendar calendar;
    private final String homeTeam;
    private final String visitTeam;
    private final int precio = 5;
    private final String curMatch;
    private  final int NUMZONES = 5;

    public int getMatchId() {
        return matchId;
    }

    public INFLUXPRICE getInfluxprice() {
        return influxprice;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCurMatch() {
        return curMatch;
    }
    public Match(String homeTeam, String visitTeam, GregorianCalendar calendar) {
        this.matchId = ++cont;
        this.calendar = calendar;
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.curMatch = homeTeam + "vs" +visitTeam;
    }


    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", cont=" + cont +
                ", influxprice=" + influxprice +
                ", calendar=" + calendar +
                ", homeTeam='" + homeTeam + '\'' +
                ", visitTeam='" + visitTeam + '\'' +
                ", precio=" + precio +
                ", curMatch='" + curMatch + '\'' +
                ", NUMZONES=" + NUMZONES +
                '}';
    }
}
