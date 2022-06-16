package com.juunweii.Kotlin

import com.juunweii.Human
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun bmiTest(){

        val Human = Human( 60.6f , 1.7f)
        Assertions.assertEquals(60.6f/(1.7f*1.7f) , Human.bmi())
    }


}