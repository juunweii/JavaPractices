package com.juunweii.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        HashMap<String , String> stocks = new HashMap<>();
        stocks.put("2330" , "台積電");
        stocks.put("2317" , "鴻海");
        stocks.put("2330" , "TSMC");

        System.out.println(stocks);

        System.out.println(stocks.get("2330"));

        for (String key : stocks.keySet()
             ) {
            System.out.println(stocks.get(key ));
        }



        //set();
        //list();
        //arrayTest();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(8);
        System.out.println(set);

        for (int i : set
             ) {
            System.out.println(i);

        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);

        System.out.println(list);

        int n1 = list.get(0);
        System.out.println(n1);

        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(55,66,77,88,99);

        for (int score: scores
             ) {
            System.out.println(score);
        }

        System.out.println(scores);
    }

    private static void arrayTest() {
        int [] numbers = new int[5];
        numbers[0]=5;
        numbers[4]=1;

        int[] scores = {55,66,77,88,99};
        System.out.println(scores);


//        for (int i=0 ; i<5 ; i++){
//            System.out.println(scores[i]);
//        }
//
        for (int n : scores){
            System.out.println(n);
        }
    }
}
