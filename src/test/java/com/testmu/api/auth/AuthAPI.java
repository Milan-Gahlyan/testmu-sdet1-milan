package com.testmu.api.auth;

import com.testmu.api.base.BaseAPI;
import io.restassured.response.Response;

public class AuthAPI extends BaseAPI {

    public Response createToken(AuthRequest request){

        return request()

                .body(request)

                .post("/auth");

    }

}