package com.juunweii;


public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");

       // new Person().hello();

        Person p = new Person( "Walton",60.6f, 1.69f);
//        p.hello();
//        p.height = 1.69f;
//        p.weight=60.6f;
        System.out.println(p.bmi());



        Ticket one = new Ticket(20,100,300);
        System.out.println(one.getOrigin());



    }
}
