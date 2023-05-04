package com.victorsashnev.tema11.Ejer06;

import java.util.GregorianCalendar;

public class Rent{
    private int rentPayment;
    private final String nameOfRentedProduct;
    private final GregorianCalendar dayWhenRented;
    public int getRentPayment() {
        return rentPayment;
    }
    public void setRentPayment(int rentPayment) {
        this.rentPayment = rentPayment;
    }
    public String getNameOfRentedProduct() {
        return nameOfRentedProduct;
    }
    public GregorianCalendar getDayWhenRented() {
        return dayWhenRented;
    }

    public Rent(int rentPayment, String nameOfRentedProduct, GregorianCalendar dayWhenRented) {
        this.rentPayment = rentPayment;
        this.nameOfRentedProduct = nameOfRentedProduct;
        this.dayWhenRented = dayWhenRented;
    }

    public void discount(){
        int discount = 1 ;
        setRentPayment(this.rentPayment - discount);
    }
    public void paymentIncrease(int days){
        int moneyPerDay = 2;
        setRentPayment(this.rentPayment + 2 * days);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentPayment=" + rentPayment +
                ", nameOfRentedProduct='" + nameOfRentedProduct + '\'' +
                ", dayWhenRented=" + dayWhenRented +
                '}';
    }
}
