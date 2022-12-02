package com.engeto.Lekce02DU1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Jiří", "Novák", LocalDate.of(2001, 7, 12));

        System.out.println();
        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());
        System.out.println(guest3.getDescription());

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);

        System.out.println();
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        Booking booking1 = new Booking(LocalDate.of(2021, 7, 19),LocalDate.of(2021, 7, 26), TypeOfVacation.BUSINESS, guest1, room1);

        Booking booking2 = new Booking(LocalDate.of(2021, 9, 1),LocalDate.of(2021, 9, 14), TypeOfVacation.PRIVATE, guest1, room3);
        booking2.addGuest(guest2);

        Booking booking3 = new Booking(guest2,room3);
        booking3.addGuest(guest1);
        booking3.addGuest(guest3);

        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);
        bookings.add(booking3);

        System.out.println();

        for (Booking booking : bookings) {
            System.out.println("Termín: " + booking.getStartDate().format(DateTimeFormatter.ofPattern("dd. MM. yyyy")) + " - "
                    + booking.getEndDate().format(DateTimeFormatter.ofPattern("dd. MM. yyyy")) + ", "
                    + "Pokoj č. " + booking.getRoom().getNumber() + ", "
                    + "Typ pobytu: " + booking.getTypeOfVacation() + ", "
                    + "Host: " + booking.getGuest().getName() + " " + booking.getGuest().getSurname() + ", "
                    + "Další hosté: " + booking.getOtherGuests()
            );
        }

    }

}