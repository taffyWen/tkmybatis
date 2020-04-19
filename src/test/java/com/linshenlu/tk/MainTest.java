package com.linshenlu.tk;

/**
 * @Author wen
 * @create 2020/3/21 20:20
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    int k = i / j;
                    System.out.println(i + "=等于 " + k +"*" + j);
                    break;
                }
                if (i == j + 1){
                    System.out.println(i + "是一个质数");
                }
            }
        }
    }
}
