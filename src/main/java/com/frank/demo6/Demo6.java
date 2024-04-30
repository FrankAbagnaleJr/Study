package com.frank.demo6;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/30 13:13 周二
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public class Demo6 {
    public static void main(String[] args) {
        String s = "KH00847";
        String[] split = s.split("KH");
        System.out.println(split.length);
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
    }
}
