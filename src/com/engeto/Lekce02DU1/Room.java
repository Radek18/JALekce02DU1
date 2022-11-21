package com.engeto.Lekce02DU1;

public class Room {

    private int number;
    private int numberOfBeds;
    private boolean isBalcony;
    private boolean isSeaView;
    private int pricePerNight;
    public Room(int number, int numberOfBeds, boolean isBalcony, boolean isSeaView, int pricePerNight) {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean getIsBalcony() {
        return isBalcony;
    }

    public void setIsBalcony(boolean isBalcony) {
        this.isBalcony = isBalcony;
    }

    public boolean getIsSeaView() {
        return isSeaView;
    }

    public void setIsSeaView(boolean isSeaView) {
        this.isSeaView = isSeaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        String result = "Číslo pokoje: " + number + ", Počet postelí: " + numberOfBeds + ", Cena za noc: " + pricePerNight + " Kč";
        if (getIsBalcony()) result += ", S balkonem";
        else result += ", Bez balkonu";
        if (getIsSeaView()) result += ", S výhledem na moře";
        else result += ", Bez výhledu na moře";
        return result;
    }

}