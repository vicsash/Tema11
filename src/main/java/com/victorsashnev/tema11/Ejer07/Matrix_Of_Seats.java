package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.LibMethods;

import java.util.Arrays;

public class Matrix_Of_Seats {
    private Seat[][] seats;
    public Seat[][] getSeats() {
        return seats;
    }
    private int counter = 1;

    /**
     * Creation of method to make an empty zone
     */
    public Matrix_Of_Seats() {
        this.seats = new Seat[Zone.ROWS_IN_ZONE][Zone.SEATS_IN_ROW];
        for(int i = 1; i <= seats.length;i++){
            for (int j = 1; j <= seats[i].length;j++){
                    this.seats[i][j] = new Seat(false, counter);
            }
        }
    }

    public void OccupySeast(){}

    /**
     *A mothod to randmoly occupy seats
     * Maybe needs deletion
     */
    public void fillRandomSeats() {
        for(int i = 1; i <= seats.length;i++){
            for (int j = 1; j <= seats[i].length;j++){
                if(LibMethods.randomNumeber(6,0)<5){
                    this.seats[i][j] = new Seat(false, counter);
                    counter++;
                }else
                    this.seats[i][j] = new Seat(true, counter);
                counter++;
            }
        }
    }

    /**
     * Method to print out zone
     * @return String which depending on if occupied  shows 1
     */
    private String printZone(){
        int counterSeat = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ;i <= seats.length;i++){
            sb.append("Row " + i +"  ->");
            for(int j = 1; j <= seats[i].length;j++){
                if(seats[i][j].occupied){
                    sb.append("1");
                }else
                    sb.append("0");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return "Seats{" +
                "seats=" + Arrays.toString(seats) +
                '}';
    }

}
