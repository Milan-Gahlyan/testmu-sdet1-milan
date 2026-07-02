package com.testmu.tests.api;

import com.testmu.api.auth.AuthAPI;
import com.testmu.api.auth.TokenManager;
import com.testmu.api.endpoints.BookingAPI;
import com.testmu.api.model.BookingRequest;
import com.testmu.api.utils.AuthDataFactory;
import com.testmu.api.utils.BookingDataFactory;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookingApiTest {

    private BookingAPI bookingAPI;

    @BeforeClass
    public void setup() {

        bookingAPI = new BookingAPI();

        Response tokenResponse =
                new AuthAPI().createToken(
                        AuthDataFactory.validCredentials());

        TokenManager.setToken(

                tokenResponse.jsonPath().getString("token")

        );

    }

    @Test(description = "Verify user can create booking successfully")
    public void verifyCreateBooking() {

        Response response =

                bookingAPI.createBooking(

                        BookingDataFactory.createBooking());

        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test(description = "Verify booking can be retrieved")
    public void verifyBookingCanBeRetrieved() {

        Response create =

                bookingAPI.createBooking(
                        BookingDataFactory.createBooking());

        int bookingId =
                create.jsonPath().getInt("bookingid");

        Response get =
                bookingAPI.getBooking(bookingId);

        Assert.assertEquals(get.statusCode(), 200);

    }

    @Test(description = "Verify booking can be updated")
    public void verifyBookingCanBeUpdated() {

        Response create =
                bookingAPI.createBooking(
                        BookingDataFactory.createBooking());

        int bookingId =
                create.jsonPath().getInt("bookingid");

        BookingRequest updated =
                BookingDataFactory.createBooking();

        updated.firstname = "Updated";

        Response update =
                bookingAPI.updateBooking(
                        bookingId,
                        updated);

        Assert.assertEquals(update.statusCode(), 200);

        Assert.assertEquals(

                update.jsonPath().getString("firstname"),

                "Updated"

        );

    }

    @Test(description = "Verify booking can be deleted")
    public void verifyBookingCanBeDeleted() {

        Response create =
                bookingAPI.createBooking(
                        BookingDataFactory.createBooking());

        int bookingId =
                create.jsonPath().getInt("bookingid");

        Response delete =
                bookingAPI.deleteBooking(bookingId);

        Assert.assertEquals(delete.statusCode(), 201);

    }

}