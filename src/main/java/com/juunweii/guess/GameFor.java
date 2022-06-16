package com.juunweii.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {

        /*int sum = 0;
        for (int i=1 ; i<11; i++){
            sum+=i;
        }
        System.out.println(sum);*/

        Random random = new Random();
        int secret = random.nextInt(10)+1;

        for (int i =0 ; i<4 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入數字：");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            else if (number == secret){
                System.out.println("Correct! The number is "+secret);
                break;
            }

            else if (number > secret){
                System.out.println("Lower! You have "+(3-i)+"more chances.");
            }
            else if (number < secret){
                System.out.println("Higher! You have "+(3-i)+"more chances.");
            }

            }
        }

}
