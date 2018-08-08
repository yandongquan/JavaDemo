package com.javakz.thread;

/**
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * @Author: yandq
 * @Description: 查看线程状态
 * @Date: Create in 9:11 2018/8/8
 * @Modified By: 
 */
public class ThreadState implements Runnable {

    public static void main(String[] args) throws InterruptedException {

        ThreadState threadState = new ThreadState();
        Thread thread = new Thread(threadState);
        System.out.println("新建线程："+thread.getState());
        thread.start();
        System.out.println("启动线程："+thread.getState());
        // 线程等待0.1秒，使线程运行waitForASecond()
        Thread.sleep(100);
        System.out.println("计时等待："+thread.getState());
        // 线程等待1秒，使线程运行waitForYears()
        Thread.sleep(1000);
        System.out.println("等待等待："+thread.getState());
        threadState.notifyNow();
        System.out.println("唤醒线程："+thread.getState());
        // 线程等待1秒，使线程结束
        Thread.sleep(1000);
        System.out.println("终止线程："+thread.getState());

    }

    public synchronized void waitForASecond() throws InterruptedException {
        // 使线程等待0.5秒 或其他线程调用notify()或notifyAll（）方法
        wait(500);
    }

    public synchronized void waitForYears() throws InterruptedException {
        // 使线程永久等待 或其他线程调用notify()或notifyAll（）方法
        wait();
    }

    public synchronized void notifyNow() throws InterruptedException {
        // 唤醒由wait()方法进入等待状态的线程
        notify();
    }

    @Override
    public void run() {
        try {
            waitForASecond();
            waitForYears();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
