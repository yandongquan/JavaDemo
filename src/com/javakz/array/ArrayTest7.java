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
        String[] sBak = new String[5];
        System.arraycopy(s,0,sBak,0,s.length);
        for (int i=0;i<sBak.length;i++) {
            System.out.println(sBak[i]+" ");
        }
        System.out.println();
        int[][] intArray = {{1,2},{1,2,3},{3,4}};
        int[][] intArrayBak = new int[3][];
        System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
        intArrayBak[2][1] = 100;
        for (int i=0;i<intArrayBak.length;i++) {
            for (int j=0;j<intArrayBak[i].length;j++) {
                System.out.println(intArrayBak[i][j]+" ");
            }
            System.out.println();
        }
    }
}
