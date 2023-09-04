package com.example.model;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;


@RestController
public class ApiRestController {

    @GetMapping("/data")
    public String getApi() {
        return "{\"message\": \"Hello, World!\"}";
    }

    @PostMapping("/data")
    public String postData(@RequestBody Map<String, String> request) {
        String login = request.get("login");
        String password = request.get("password");
        String currentDate = LocalDate.now().toString();

        return "{\"login\": \"" + login + "\", \"password\": \"" + password + "\", \"date\": \"" + currentDate + "\"}";
    }

//    public static String generateString(Random rng, String characters, int length)
//    {
//        char[] text = new char[length];
//        for (int i = 0; i < length; i++)
//        {
//            text[i] = characters.charAt(rng.nextInt(characters.length()));
//        }
//        return new String(text);
//    }
    
/*    @PostMapping("/api")
    public String postApi(@RequestBody RequestBody requestBody) {
        ResponseBody responseBody = new ResponseBody(requestBody.getLogin(), requestBody.getPassword());
        return responseBody.toString();
    }*/

}