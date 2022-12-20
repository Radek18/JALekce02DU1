package com.engeto.Lekce02DU1;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {

    private final List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

}