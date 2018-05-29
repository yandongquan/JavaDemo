package com.javakz.array;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 9:12 2018/5/29
 * @Modified By:
 */
public class ArrayTest7 {
    public static void main(String[] args) {
        String[] s = {"Mircosoft","IBM","Sun","Oracle","Apple"};
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for (int i=0;i<sBak.length;i++) {
            System.out.println(sBak[i]+" ");
        }
    }
}
