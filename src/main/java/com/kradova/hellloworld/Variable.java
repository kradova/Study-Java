package com.kradova.hellloworld;


public class Variable {

    public static void main(String[] args) {
        byte userAge = 20;
        short numberOfStudents = 45;
        int numberOfEmploees = 500;
        long numberOfInhabitants = 21021313012678L;
        
        float hourlyLate = 60.5F;
        double nomberOfHours = 5120.5;
        
        char grade = 'A';
        boolean promote = true;
        
        byte level = 2, userExpiriens = 5;
        
        byte year;
        year = 20;
        
        //Базовые операторы
        
        int x=7, y=2;
        
        //сложение
        System.out.println(x + y);
        
        //вычитание
        System.out.println(x - y);
       
        //умножение
        System.out.println(x * y);
       
        //деление
        System.out.println(x / y);
               
        //остаток
        System.out.println(x % y);
        
        
        // Другие операторы присваивания
        
         x = 10;
        
        System.out.println(x += 2);
        System.out.println(x -= 2);
        System.out.println(x *= 2);
        
        System.out.println(++x);
        System.out.println(--x);
        
                }
}
