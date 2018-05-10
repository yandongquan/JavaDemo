package com.javakz.commonlyclass;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 11:47 2018/5/10
 * @Modified By:
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("==============输出结果=================");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
