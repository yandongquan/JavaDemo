package com.javakz.dateandtime;

import java.util.Date;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 16:13 2018/5/10
 * @Modified By:
 */
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        long t = System.currentTimeMillis();
        System.out.println(t);
        Date d2 = new Date(1000);

        System.out.println(d2.toInstant());

        d2.setTime(15259406);
        System.out.println(d.getTime());
        System.out.println(d2.getTime()<d.getTime());
    }
}
