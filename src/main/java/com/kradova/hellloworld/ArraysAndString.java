package com.kradova.hellloworld;

public class ArraysAndString {

    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message);

        String anotherMessage = "";
        System.out.println(anotherMessage);

        String myName = "Hello World," + "my name is Jamie";
        System.out.println(myName);

        // МЕТОДЫ STRING    "Hello World".length();
        int myLength = "Hello World".length();
        System.out.println(myLength);

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
//        for (int i = 0; i < splitNames.length; i++) {
//            System.out.println(splitNames[i]);
//        }

        for (String item : splitNames) {
            System.out.println(item);
        }
    }// main
}// class ArraysAndString 
