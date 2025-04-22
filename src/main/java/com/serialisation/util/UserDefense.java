package com.serialisation.util;

import java.util.Date;

public class UserDefense {
    private Date birthDay;

    public UserDefense(Date birthDay) {
        this.birthDay = new Date(birthDay.getTime());
    }

    public Date getBirthDay() {
           return new Date(birthDay.getTime());
       }

    @Override
    public String toString() {
        return "User{" +
                "birthDay=" + birthDay +
                '}';
    }
}