package com.javakz.commonlyclass;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 14:12 2018/5/10
 * @Modified By:
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello ");
        stringBuffer.append("World");
        System.out.println(stringBuffer.toString());
        stringBuffer.delete(1,2);
        System.out.println(stringBuffer.toString());
        stringBuffer.insert(1, "e");
        System.out.println(stringBuffer.toString());
        stringBuffer.deleteCharAt(2);
        System.out.println(stringBuffer.toString());
        stringBuffer.reverse();
        System.out.println(stringBuffer.toString());
    }
}
