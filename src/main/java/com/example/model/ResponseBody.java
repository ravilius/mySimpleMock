package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class ResponseBody {
    private String login;
    private String password;
    private LocalDateTime currentDate;

    // Конструкторы, геттеры и сеттеры


/*    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
*/
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setCurrentDate(LocalDateTime currentDate) {
//        this.currentDate = currentDate;
//    }
//
//    @Override
//    public String toString() {
//        return "[{\"login\": \"" + login + "\", \"password\": \"" + password + "\", \"currentDate\": \"" + currentDate + "\"}]";
//    }
}
