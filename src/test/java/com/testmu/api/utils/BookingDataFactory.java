package com.testmu.api.utils;

import com.testmu.api.model.BookingDates;
import com.testmu.api.model.BookingRequest;

public final class BookingDataFactory {

    private BookingDataFactory(){}

    public static BookingRequest createBooking(){

        BookingDates dates = new BookingDates();

        dates.checkin = "2026-08-01";

        dates.checkout = "2026-08-10";

        BookingRequest booking = new BookingRequest();

        booking.firstname = "Milan";

        booking.lastname = "Gahlyan";

        booking.totalprice = 1200;

        booking.depositpaid = true;

        booking.bookingdates = dates;

        booking.additionalneeds = "Breakfast";

        return booking;

    }

}