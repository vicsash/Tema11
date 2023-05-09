package com.victorsashnev.tema11.Ejer07;

public class Stadium {
    public enum influxPrice {
        LOW_INFLUX(0.75), MEDIUM_INFLUX(1), HIGH_INFLUX(1.3);
        private final double value;

        influxPrice(double i) {
            value = i;
        }

        public double getValue() {
            return value;
        }
    }
    private influxPrice gamePrice;

    public influxPrice getGamePrice() {
        return gamePrice;
    }

    protected static final int CAPACITYPERZONE = 5;

    private final int price = 5;
    private  Match match;
    private Zone[] zone;


    public Stadium(){
        zone = new Zone[CAPACITYPERZONE];
        match = new Match();
        //Post correction 09/05
        // put this class(Stadium) into match
        // or stadium then match zone entrance and vip or normal
    }

        /*Add a random seat, was used in vip and normal taken out but saved
        *  for(int i = 0; i < numRand ; i++ ){
            full = false;
            do {
                randRow = LibMethods.randomNumeber(10,0);
                randomCol = LibMethods.randomNumeber(10,0);
                if(seatZone[randRow][randomCol] == 0){
                    seatZone[randRow][randomCol] = 1;
                    full =true;
                }
            }while(full);
            this.alfaNumerico = alfaNumRand();
        }*/

}
