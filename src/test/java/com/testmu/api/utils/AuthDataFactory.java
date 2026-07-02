package com.testmu.api.utils;

import com.testmu.api.auth.AuthRequest;

public final class AuthDataFactory {

    private AuthDataFactory() {
    }

    public static AuthRequest validCredentials() {

        AuthRequest request = new AuthRequest();

        request.username = "admin";

        request.password = "password123";

        return request;

    }

}