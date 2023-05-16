package com.victorsashnev.tema11.Ejer07;

import com.victorsashnev.tema11.Ejer07.Entrance.Entrance;

public class Zone{

    private Entrance entrance;
    protected Zone(){
       entrance = new Entrance();
    }

    public Zone(Entrance entrance) {
        this.entrance = entrance;
    }
}
