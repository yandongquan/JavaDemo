package com.javakz.exception;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 18:53 2018/5/9
 * @Modified By:
 */
public class TestException {
    public static void test() throws MyException {
        throw new MyException("这是一个业务异常");
    }
    public static void test2() throws MyException {
        throw new MyException("这是一个业务异常");
    }
    public static void main(String[] args) throws MyException {
//        char a = 'a';
//        int i = 10/0;
        try {
            int i = 10/0;
        } catch (Exception e) {

        }

        try {
            int i = 10/0;
        } catch (Exception e) {

        } finally {
            System.out.println("--------------------------");
        }

        try {
            int i = 10/2;
        } finally {
            System.out.println("-----10/2-----------");
        }

//        test();
    }
}
