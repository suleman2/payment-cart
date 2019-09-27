package com.example.springpaypalexample;

import com.stripe.exception.ApiConnectionException;
import com.sun.tools.javac.util.DefinedBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
/*
* this class config the mode, client id, secret id that i have declared in application.properties file*/
public class PaypalConfig
{
    @Value("${strip.client.id}")
    private String clientId;
    @Value("${stripe.client.secret}")
    private String clientSecret;
    @Value("${stripe.mode}")
    private String mode;

//stripe SDK configuration
    @Bean
    public Map<String,String > stripeSdkConfig()
    {
        Map<String,String> configMap = new HashMap<>();//object for Map
        configMap.put("mode",mode);//mode that added in application.properties file
        return configMap;
    }
    //auth token for stripe account by taken client id and secret

    public API 

}
