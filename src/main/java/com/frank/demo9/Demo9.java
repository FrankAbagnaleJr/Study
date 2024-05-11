package com.frank.demo9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/5/11 19:17 周六
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public class Demo9 {
    public static void main(String[] args) {
        Dog d1 = new Dog("a");
        Dog d2 = new Dog("b");
        List<Dog> dog = new ArrayList<>();
        dog.add(d1);
        dog.add(d2);
        System.out.println(dog);

        dog.stream().forEach(s ->{
            s.setName(s.getName()+"1");
        });
        System.out.println(dog);

    }
}
