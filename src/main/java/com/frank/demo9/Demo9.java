package com.frank.demo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @auther: frank gee
 * @date: 2024-5-4 19:51 周六
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
public class Demo9 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3);
        List<Long> longList = Arrays.asList(1L,2L,3L);
        List<String> strList = Arrays.asList("1","2","3");

        Stream<Integer> intStream = intList.stream();
        Stream<Long> longStream = longList.stream();
        Stream<String> strStream = strList.stream();

//        Integer a = (Number) 1;
//        List<Integer> collect = Stream.concat(intStream, longStream).filter(s -> ((Number) s).intValue() > 2).map(s -> (Integer) s).collect(Collectors.toList());


        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c = new Cat();

        List<Dog> dogList = new ArrayList<>();
        List<Dog> dcList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        dogList.add(d1);
        catList.add(c);
        dcList.add(d2);

        Stream<Dog> stream = dogList.stream();
        Stream<Cat> stream1 = catList.stream();
        Stream<Dog> stream2 = dcList.stream();


        // 切记避免嵌套流，不然会出错
        Stream<Object> concat = Stream.concat(stream, stream1);
//        Stream<Dog> concat1 = Stream.concat(stream, stream2);

        concat.forEach(s -> {
            if (s instanceof Dog) {
                System.out.println("有一个狗对象");
            }
            if (s instanceof Cat) {
                System.out.println("有一个猫对象");
            }

        });

    }
}
