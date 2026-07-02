package com.testmu.api.endpoints;

import com.testmu.api.base.BaseAPI;
import com.testmu.api.model.BookingRequest;
import io.restassured.response.Response;

public class BookingAPI extends BaseAPI {

    public Response createBooking(BookingRequest request){

        return request()

                .body(request)

                .post("/booking");

    }

    public Response getBooking(int bookingId){

        return request()

                .get("/booking/" + bookingId);

    }

}