package com.testmu.api.auth;

public final class TokenManager {

    private static String token;

    private TokenManager(){}

    public static void setToken(String value){

        token = value;

    }

    public static String getToken(){

        return token;

    }

}