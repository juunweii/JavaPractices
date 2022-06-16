package com.juunweii.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {

        LocalDateTime enterT = LocalDateTime.of(2022,06,04,8,0,0);
        LocalDateTime leaveT = LocalDateTime.of(2022,06,04,11,20,0);

        Car car = new Car("AA-0001" , enterT);
        car.setLeave(leaveT);
        System.out.println(car.getDuration());

        double hours = (double)car.getDuration() / 60;
        System.out.println(hours);

        int price = (int)Math.ceil(hours) * 30 ;
        System.out.println("停車費為："+price+"元");














        //java8_NewDate();
        //javaOldDate();
    }

    private static void java8_NewDate() {
        Instant instant = Instant.now(); //預設的時區是格林威治時區(台灣要+8)
        System.out.println(instant);

        //Local時間
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //規定格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(ldt));
        //更改時間，java8新類別是immutable的，不會改變原本ldt的時間

        System.out.println(ldt.plus(Duration.ofHours(3))); //加三小時

        //生成新的時間
        LocalDateTime other = LocalDateTime.of(2022, 6, 4, 8,0 , 0);
        System.out.println(other);
    }

    private static void javaOldDate() {
        Date date = new Date(); // 舊式的date類別
        System.out.println(date);
        System.out.println(date.getTime()); // 1970年1月1日至今的毫秒數存在long長整數中

        //把Date轉成常見的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(sdf.format(date));

        // 把任意日期(字串)轉換成Date物件

        String s = "2022/06/04 08:00:00";

        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        //對Date物件做時間、日期上的運算要用Calender
        Calendar calender = Calendar.getInstance();
        System.out.println(calender.getTime()); // 得到目前時間的Date物件
        calender.set(Calendar.MONTH , 0); //改變Date物件的月份，0代表一月
        System.out.println(calender.getTime());
        calender.add(Calendar.DAY_OF_YEAR , 3); //加上天數
        System.out.println(calender.getTime());

        calender.set(Calendar.DATE , 9);
        System.out.println(calender.getTime());


        //因為Date物件的資訊可以改變 -> mutable
    }
}
