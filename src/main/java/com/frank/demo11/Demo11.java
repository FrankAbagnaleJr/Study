package com.frank.demo11;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/5/26 16:43 周日
 * @Project_Name: Study
 * @Version: 1.0
 * @description
 */
public class Demo11 {
    public static void main(String[] args) {
        long startDate = System.currentTimeMillis();
        for (int i = 1; i <=10000; i++) {
            System.out.println(i);
        }
        System.out.println((System.currentTimeMillis() - startDate) / 1000.0);
    }
}
