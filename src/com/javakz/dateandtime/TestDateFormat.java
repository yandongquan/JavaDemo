package com.javakz.dateandtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 16:26 2018/5/10
 * @Modified By:
 */
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于本月的第W周");
        Date date = new Date(12321314323L);
        String str = dateFormat.format(date);
        System.out.println(str);

        String str2 = "1997-07-07";
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = dateFormat1.parse(str2);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
