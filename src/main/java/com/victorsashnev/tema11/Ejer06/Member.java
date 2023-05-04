package com.victorsashnev.tema11.Ejer06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Member {
    private final String nif;
    private final String name;
    private final GregorianCalendar birthdate;
    private final String city;
    private boolean Debt;
    public String getNif() {
        return nif;
    }
    public String getName() {
        return name;
    }
    public GregorianCalendar getBirthdate() {
        return birthdate;
    }
    public String getCity() {
        return city;
    }

    public void setDebt(boolean debt) {
        Debt = debt;
    }

    public Member(String nif, String name, GregorianCalendar birthdate, String city) {
        this.nif = nif;
        this.name = name;
        this.birthdate = birthdate;
        this.city = city;
        Debt = false;
    }



    @Override
    public String toString() {
        return "Member{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", city='" + city + '\'' +
                ", Debt=" + Debt +
                '}';
    }
}
