package com.juunweii.student;

public class GraduateStudent extends Student{



    int thesis;
    static int pass = 70;


    @Override
    public void print() {
        int average = getAverage();


        System.out.print("Name: "+name+"\n"+english+"\t"+math+"\t"+thesis);
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
    }


    public GraduateStudent(String name, int english, int math, int thesis ){
        super(name, english,math);
        this.thesis = thesis;



    }
}
