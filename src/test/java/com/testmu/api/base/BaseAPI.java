package com.testmu.api.base;

import com.testmu.config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public abstract class BaseAPI {

    protected RequestSpecification request() {

        RestAssured.baseURI = ConfigReader.get("api.base.url");

        return RestAssured
                .given()
                .contentType("application/json");

    }

}