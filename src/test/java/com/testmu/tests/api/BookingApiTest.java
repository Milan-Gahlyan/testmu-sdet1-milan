package com.testmu.tests.api;

import com.testmu.api.endpoints.BookingAPI;
import com.testmu.api.model.BookingRequest;
import com.testmu.api.utils.BookingDataFactory;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingApiTest {

    @Test

    public void verifyCreateBooking(){

        BookingAPI bookingAPI = new BookingAPI();

        BookingRequest booking =
                BookingDataFactory.createBooking();

        Response response =
                bookingAPI.createBooking(booking);

        Assert.assertEquals(
                response.statusCode(),
                200);

    }

    @Test

    public void verifyBookingCanBeRetrieved(){

        BookingAPI bookingAPI = new BookingAPI();

        BookingRequest booking =
                BookingDataFactory.createBooking();

        Response create =
                bookingAPI.createBooking(booking);

        int bookingId =
                create.jsonPath().getInt("bookingid");

        Response get =
                bookingAPI.getBooking(bookingId);

        Assert.assertEquals(
                get.statusCode(),
                200);

        Assert.assertEquals(

                get.jsonPath().getString("firstname"),

                "Milan"

        );

    }

}