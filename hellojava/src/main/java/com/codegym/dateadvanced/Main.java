package com.codegym.dateadvanced;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        String dt = "2022-12-31";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, 1);  // number of days to add

        dt = sdf.format(c.getTime());
        System.out.println(dt);



        String dt1 = "2022-11-02";
        Date input = sdf.parse(dt1);
        Instant instant = input.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate date = zdt.toLocalDate();

        System.out.println(date);
        System.out.println("First day: " + date.withDayOfMonth(1));
        System.out.println("Last day: " + date.withDayOfMonth(date.lengthOfMonth()));

        Date d1 = new Date();       // 28-12-2022 08:33:40
        Date d2 = new Date();       // 28-12-2022 08:33: 50

        /**
            Lấy ra những hóa đơn theo từng tháng: 1,2,3,4,5,6,7,8,9,10,11,12
            Lấy ra những hóa đơn theo 2 ngày bất kì: 2022-12-05 -> 2022-12-20
            Lất ra nhưững hóa đơn theo 1 ngày người ta nhập vào: 022-12-05

         */



    }
}
