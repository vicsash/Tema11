package com.victorsashnev.tema11.Ejer07;

public class Stadium {

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

        private final int[] CAPACITYPERZONE = {5,5};
        private final int price = 5;
        private  Match match;
          Zone zone = new Zone(CAPACITYPERZONE);
        private final INFLUXPRICE gamePrice;

    public INFLUXPRICE getGamePrice() {
        return gamePrice;
    }
}
