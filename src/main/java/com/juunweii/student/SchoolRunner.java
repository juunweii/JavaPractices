package com.juunweii.student;

import java.util.Scanner;

public class SchoolRunner {

    public static void main(String[] args) {

//        userInput();



        Student.pass = 50;

        Student stu = new Student("Tom", 59, 60); //將Student類別在記憶體中生成物件

        Student stu2 = new Student("Josh", 80,90);
        Student stu3 = new Student("JJ", 45,49);

        GraduateStudent gstu = new GraduateStudent("Jack", 60, 60, 60);

        gstu.print();

        stu.print();
        stu2.print();
        stu3.print();

        System.out.println("highest score: "+ stu.highest());
    }








    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name: ");
        String name = scanner.next();

        System.out.println("English score: ");
        int english = scanner.nextInt();

        System.out.println("Math score: ");
        int math = scanner.nextInt();

        Student stu = new Student(name, english, math); //將Student類別在記憶體中生成物件

        stu.print();

        System.out.println("highest score: "+ stu.highest());
    }
}
