package com.juunweii.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {

    //這個Class中有三個屬性
    private String id;
    private LocalDateTime enterT;
    private LocalDateTime leaveT;



    //Constructor
    //先想，一台車要出生的時候，需要哪些資訊才能生出這台車呢？
    public Car(String id, LocalDateTime enterT) {
        this.id = id;
        this.enterT = enterT;
    }


    public long getDuration(){
        Duration duration = Duration.between(enterT,leaveT);
        return duration.toMinutes();
    }

    public void leave(){
        leaveT = LocalDateTime.now();
    }

    public void setLeave( LocalDateTime leaveT){

        if (leaveT.isAfter(enterT)) {
            this.leaveT = leaveT;
        }
    }
}
