package com.kradova.hellloworld;

import java.util.Scanner;

public class ControlCommands {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 100) {
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        } else if (userAge < 18) {
            System.out.println("Sorry you are underage");
        } else if (userAge < 21) {
            System.out.println("You need parental consent");
        } else {
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");

        }

        int myNum = 3 > 2 ? 10 : 5;
        System.out.println(myNum);

        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();

        switch (userGrade) {
            case "A+":
            case "A":
                System.out.println("Distinction");
                break;
            case "B":
                System.out.println("B Grade");
                break;
            case "C":
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Fail");
               break;

        //        Циклы
        // comand for
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int[] myNumbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        // extended command
        int[] myNumbers1 = {10, 20, 30, 40, 50};
        for (int item : myNumbers1) {
            System.out.println(item);
        }
        // command while
        int counter = 5;
        while (counter > 0) {
            System.out.println("Counter = " + counter);
            counter = counter - 1;
        }
        // do-while
        int counter1 = 100;
        do {
            System.out.println("Counter1 = " + counter1);
            counter1++;
        } while (counter1 < 0);*/

        //Команды перехода
        //command break
        /*  for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            if (i == 2) {
                break;
            }
        }
        //command continue
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            if (i == 2) {
                continue;
            }
            System.out.println("I will not be printed if i=2.");
        }*/
        //ErrorDemo
        int num, deno;

        try {
            System.out.print("Please enter the numerator: ");
            num = input.nextInt();

            System.out.print("Please enter the denominator: ");
            deno = input.nextInt();

            System.out.println("The result is " + num / deno);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(
                    "---- End of Error Handling Example ----");
        }
    }
}
