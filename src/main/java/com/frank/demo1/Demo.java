package com.frank.demo1;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther: frank gee
 * @date: 2024-3-3 15:01 周日
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
public class Demo {

    //Set集合中，如果添加同一类型的对象，属性不同，是否会失败
    public static void main(String[] args) {
        User1 user1 = new User1(1l,"小明",20,"a");
        User2 user2 = new User2(1l,"小明",20,"a");
        User2 user3 = new User2(1l,"小明",20,"a");
        Set<User> set = new HashSet<>();
        System.out.println(set.add(user1));  //true
        System.out.println(set.add(user2));  //true
        System.out.println(set.add(user3));  //false
    }
}
