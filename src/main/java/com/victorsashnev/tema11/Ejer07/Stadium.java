package com.victorsashnev.tema11.Ejer07;

import com.github.javafaker.Faker;
import com.victorsashnev.tema11.Ejer07.Entrance.NormalEntrance;
import com.victorsashnev.tema11.Ejer07.Entrance.VipEntrance;
import com.victorsashnev.tema11.LibMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Stadium {
        Faker faker = new Faker();
        public final int NUMZONAS = 8;
        public final int NUMZONASVIP = 2;
        public final int PRICE = 5;
        public final int MAXMATCHES = 20;
        protected VipEntrance vipEntrance;
        protected NormalEntrance normalEntrance;
        protected Zone[] zone;
        protected ArrayList<Match> matches;

        public Stadium(){
                generateMatch();
        }
        private void generateMatch(){
                String home = faker.esports().team();
                String vistor = faker.esports().team();
                GregorianCalendar calendar;
                calendar = LibMethods.dateWithRand();
                matches.add(new Match(home,vistor,calendar));
        }
        public void generateZones(int NUMZONASVIP){
                int vip = NUMZONASVIP;
                for(int i = 1; i < NUMZONAS;i++){
                        if(vip > 0){
                                this.zone[i-1] = new Zone(i, TypeEntrance.VIP);
                        }else if(vip < 0){
                                this.zone[i-1] = new Zone(i,TypeEntrance.NORMAL);
                        }
                }
        }
        @Override
        public String toString() {
                return "Stadium{" +
                        "zone=" + Arrays.toString(zone) +
                        '}';
        }
}
