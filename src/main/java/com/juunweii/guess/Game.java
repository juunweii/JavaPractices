package com.juunweii.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(10)+1; //bound 10 = 產生0~9的亂數
        int number = 0;
        while (number != secret) {
            System.out.println("Please enter a nember: ");
            number = scanner.nextInt();

            if (number > secret){
                System.out.println("The number is lower");
            }
            else if (number < secret){
                System.out.println("The number is larger");
            }
            else {
                System.out.println("Correct! The number is :"+number);
            }
        }




  /*      int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<4);
*/

    }


}
