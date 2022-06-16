package com.juunweii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest(){
        Person person = new Person(60.6f,1.69f);
        Assertions.assertEquals(60.6f/(1.69f*1.69f) , person.bmi());

    }
}
