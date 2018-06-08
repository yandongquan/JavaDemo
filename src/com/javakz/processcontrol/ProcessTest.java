package com.javakz.processcontrol;

/**
 * @Author: yandq
 * @Description:
 * @Date: Create in 14:56 2018/6/8
 * @Modified By:
 */
public class ProcessTest {
    public static void main(String[] args) {
        // if 单分支选择结构
        /*int i = (int)(10*Math.random());
        if (i>5) {
            System.out.println("i 大于5");
        }*/

        // if-else 双分支选择结构
        /*int i = (int)(10*Math.random());
        if (i>5) {
            System.out.println("i 大于5");
        } else {
            System.out.println("i 小于5");
        }*/

        int age = (int) (100 * Math.random());
        System.out.print("年龄是" + age + ", 属于");
        if (age < 15) {
            System.out.println("儿童, 喜欢玩！");
        } else if (age < 25) {
            System.out.println("青年, 要学习！");
        } else if (age < 45) {
            System.out.println("中年, 要工作！");
        } else if (age < 65) {
            System.out.println("中老年, 要补钙！");
        } else if (age < 85) {
            System.out.println("老年, 多运动！");
        } else {
            System.out.println("老寿星, 古来稀！");
        }

        char c = 'a';
        int rand = (int) (26 * Math.random());
        char c2 = (char) (c + rand);
        System.out.print(c2 + ":");
        switch (c2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(" 元音 ");
                break;
            case 'y':
            case 'w':
                System.out.println(" 半元音 ");
                break;
            default:
                System.out.println(" 辅音 ");
        }

        int i = 0;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum= " + sum);

        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }
        System.out.println("-----");
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 0);

        int total = 0;
        System.out.println("Begin");
        while (true) {
            total++;
            int z = (int) Math.round(100 * Math.random());
            if (z == 88) {
                break;
            }
        }
        System.out.println("Game over, used " + total + " times.");

        for (int k = 100; k < 150; k++) {
            if (k % 3 == 0) {
                continue;
            }
            System.out.println(k);
        }


        int count = 0;
        outer:
        for (int k = 101; k < 150; k++) {
            for (int j = 2; j < k / 2; j++) {
                if (k % j == 0) {
                    continue outer;
                }
            }
            System.out.println(k + " ");
        }

        System.out.println("---------------------99乘法表---------------------------");
        for (int k=1; k<=9; k++) {
            for (int j=1; j<=k; j++) {
                if (k*j<10) {
                    System.out.print(j+"*"+k+"= "+k*j+ "    ");
                } else {
                    System.out.print(j+"*"+k+"="+k*j+ "    ");
                }

            }
            System.out.println("");
        }
    }
}
