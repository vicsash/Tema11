package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.Ejer07.Entrance.Entrance;

public class Zone{
    public static final int COL_IN_ZONE = 5;
    public static final int ROW_IN_ZONE = 5;
    private Entrance entrance;
    protected Matrix_Of_Seats seatsInZones;
    protected Zone(){
        this.seatsInZones = new Matrix_Of_Seats(COL_IN_ZONE,ROW_IN_ZONE);
        this.entrance = new Entrance();
    }

    private Matrix_Of_Seats seatsInZone() {

        return seatsInZones;
    }

    public Zone(Entrance entrance) {
        this.entrance = entrance;
    }
}
