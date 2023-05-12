package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.Ejer07.Entrance.Entrance;

import java.util.Arrays;

public class Zone{
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
    private INFLUXPRICE gamePrice;
    private  final int ROWS = 10;
    private final int COLM = 10;
    protected int[][] seatZone;

    protected final int MAXSEAT = ROWS * COLM;

    private Entrance[] entrance;
    private final int TYPEOFENTRACE = 1;
    protected Zone(){
       entrance = new Entrance[TYPEOFENTRACE];
    }

    public INFLUXPRICE getGamePrice() {
        return gamePrice;
    }
    public int[][] getSeatZone() {
        return seatZone;
    }


    @Override
    public String toString() {
        return "Zone{" +
                "gamePrice=" + gamePrice +
                ", seatZone=" + Arrays.toString(seatZone) +
                '}';
    }
}
