package com.engeto.Lekce02DU1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private LocalDate startDate;
    private LocalDate endDate;
    private TypeOfVacation typeOfVacation;
    private Guest guest;
    private List<Guest> otherGuests = new ArrayList<>();
    private Room room;

    public Booking(LocalDate startDate, LocalDate endDate, TypeOfVacation typeOfVacation, Guest guest, Room room) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
        this.guest = guest;
        this.room = room;
    }

    public Booking(Guest guest, Room room) {
        this(LocalDate.now(), LocalDate.now().plusDays(6), TypeOfVacation.BUSINESS, guest, room);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void addGuest(Guest guest) {
        otherGuests.add(guest);
    }

}