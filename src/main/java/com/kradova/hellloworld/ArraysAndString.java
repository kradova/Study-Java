package com.kradova.hellloworld;

import java.util.Arrays;

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

            String uCase = "Hello World".toUpperCase();
            System.out.println(uCase);

            String uCase1 = "Hello World".toLowerCase();
            System.out.println(uCase1);

            String FirstSubstring = "Hello World".substring(6);
            System.out.println(FirstSubstring);

            String secondSubstring = message.substring(1, 8);
            System.out.println(secondSubstring);

            char myChar = "Hello World".charAt(1);
            System.out.println(myChar);

            boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
            boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
            System.out.println(equalsOrNot);
            System.out.println(equalsOrNot2);
        }// for

        //Array
        int[] userAge;
        userAge = new int[]{21, 22, 23, 24, 25};

        int[] userAge2 = {21, 22, 23, 24, 25};

        int[] userAge3 = new int[5];

        userAge[0] = 31;

        userAge[2] = userAge[2] + 2;

        //equals()
        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        int[] arr3 = {10, 8, 6, 4, 2, 0};
        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        System.out.println(result1);
        System.out.println(result2);
        
        //copyOfRange()
        int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
        int[] dest = Arrays.copyOfRange(source, 3, 7);
        
        //toString() 
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        
        //sort()
        int [] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        
        //binarySearch()
    }// main
}// class ArraysAndString 
