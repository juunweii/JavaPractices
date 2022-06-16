package com.juunweii;

import com.juunweii.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void highestTest(){
        Student student = new Student("CCC",80,90);
        Assertions.assertEquals(90,student.highest());
    }

    @Test
    public void averageTest(){
        Student student = new Student("CCC",80,90);
        Assertions.assertEquals(85,student.getAverage());
    }
}
