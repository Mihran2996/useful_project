package com.example.exception.tryWithFinaly;

public class TryWithFinally {

   public static void main(String[] args) {
      System.out.println(method());
   }

   public static int method() {
      try {
         System.out.println("Try Block with return type");
         return 10;
      } finally {
         System.out.println("Finally Block always execute");
      }
   }

}