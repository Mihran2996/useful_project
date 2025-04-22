package com.serialisation.util;

import java.util.Date;

 public class User {
     private Date birthDay;

     public User(Date birthDay) {
         this.birthDay = birthDay;
     }

     public Date getBirthDay() {
            return birthDay;
        }

     @Override
     public String toString() {
         return "User{" +
                 "birthDay=" + birthDay +
                 '}';
     }
 }