package com.frank.demo7;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/30 13:17 周二
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public class Demo7 {
    public static void main(String[] args) {
        final Integer[] userType = {null};
        //userType = {0,1,2,3}; //不可以
        userType[0] = 1;
        System.out.println(userType[0]);
        userType[0] = 2;
        System.out.println(userType[0]);
    }
}
