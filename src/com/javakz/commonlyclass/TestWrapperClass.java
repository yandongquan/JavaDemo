package com.javakz.commonlyclass;

/**
 * @Author: yandq
 * @Description: 测试自动装箱和拆箱
 * @Date: Create in 11:10 2018/5/10
 * @Modified By:
 */
public class TestWrapperClass {
    public static void main(String[] args) {
//        Integer a = new Integer(100);
        // jdk5.0以后，自动装箱
        Integer a = 22;

        Integer b = 1000;
        // 自动拆箱
        int c = b;
        System.out.println(c);

        Integer d = 111;
        Integer e = 111;
        System.out.println(d==e);
        System.out.println(d.equals(e));

        System.out.println("*******************************");

        Integer f = -129;
        Integer g = -129;
        // [-128,127]之间的数，仍然当做基本数据类型来处理
        System.out.println(f==g);
        System.out.println(f.equals(g));

    }
}
