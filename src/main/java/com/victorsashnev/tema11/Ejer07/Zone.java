package com.victorsashnev.tema11.Ejer07;

public class Zone{
    private final int idZone;
    private final TypeEntrance type;
    public static final int ROWS_IN_ZONE = 10;
    public static final int SEATS_IN_ROW = 10;
    protected Entrance entrance;
    protected VipEntrance vipEntrance;
    protected NormalEntrance normalEntrance;
    protected Matrix_Of_Seats seatsInZones;
    public int getIdZone() {
        return idZone;
    }
    public TypeEntrance getType() {
        return type;
    }

    public Matrix_Of_Seats getSeatsInZones() {
        return seatsInZones;
    }
    protected Zone(int numzone, TypeEntrance type){
        this.idZone = numzone;
        this.type = type;
        seatsInZones = new Matrix_Of_Seats();
    }
    private Matrix_Of_Seats seatsInZone() {
        return seatsInZones;
    }
}
