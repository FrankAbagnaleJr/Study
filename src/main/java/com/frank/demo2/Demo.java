package com.frank.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: frank gee
 * @date: 2024-3-24 18:33 周日
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
public class Demo {
    public static void main(String[] args) {
        User u1 = new User("小米",20,new ArrayList<String>(Arrays.asList("111","222","333")));
        User u2 = u1;

        u2.setName("小白");
        u2.setList(new ArrayList<String>(Arrays.asList("u21","u22","u23")));

        System.out.println(u1);
        System.out.println(u2);


        /**
         输出结果都一样
         User(name=小白, age=20, list=[u21, u22, u23])
         User(name=小白, age=20, list=[u21, u22, u23])
         */
    }
}
