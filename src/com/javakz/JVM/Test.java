package com.javakz.JVM;

import java.util.ArrayList;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 18:57 2018/5/14
 * @Modified By:
 */
public class Test {

    public void testHeap(){
        for(;;){
            ArrayList list = new ArrayList(2000);
        }
    }
    int num=1;
    public void testStack(){
        num++;
        this.testStack();
    }

    public static void main(String[] args){
        Test  t  = new Test ();
        t.testHeap();
        t.testStack();
    }
}
