package com.juunweii.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;



    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }


     public int highest(){
        int max = (english > math)? english : math;
//
//        if (english > math){
//            max = english;
//        }
//        else{
//            max = math;
//        }

        return max;
    }



    public void print(){

        int average = getAverage();


        System.out.print("Name: "+name+"\n"+english+"\t"+math);
        System.out.print("\t"+getAverage()+"\t"+
                ( (getAverage() >= pass) ? "Pass" : "Fail") +"\n" );

        char grading = 'F';
        switch (average/10) {

            case 10:
                grading = 'A';
                break;

            case 9:
                grading = 'B';
                break;

            case 8:
                grading = 'C';
                break;

            case 7:
                grading = 'D';
                break;

            case 6:
                grading = 'E';
                break;

        }
        System.out.println(grading);

    /*    if (getAverage() >= 60){
            System.out.println("\tPass");
        }
        else{
            System.out.println("\tFail");
        }*/

    }

    public int getAverage(){
        return (english + math) / 2;
    }

}
