package com.frank.demo4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/29 16:18 周一
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public class Demo4 {
    private static List<Stu> list;
    static{
        Stu s1 = new Stu().setId(1L).setName("路飞").setAge(20).setBirthday(LocalDate.of(2024, 01, 01));
        Stu s2 = new Stu().setId(2L).setName("索隆").setAge(21).setBirthday(LocalDate.of(2024, 01, 02));
        Stu s3 = new Stu().setId(3L).setName("乌索普").setAge(22).setBirthday(LocalDate.of(2024, 01, 03));
        Stu s4 = new Stu().setId(4L).setName("山治").setAge(23).setBirthday(LocalDate.of(2024, 01, 04));
        Stu s5 = new Stu().setId(5L).setName("布鲁克").setAge(24).setBirthday(LocalDate.of(2024, 01, 05))
                .setList(Arrays.asList(new Usr().setId(1L).setName("娜美")));
        Stu s6 = new Stu().setId(5L).setName("布鲁克").setAge(24).setBirthday(LocalDate.of(2024, 01, 05))
                .setList(Arrays.asList(new Usr().setId(1L).setName("罗宾")));
        list = Arrays.asList(s1,s2,s3,s4,s5,s6);
    }
    public static void main(String[] args) {
        List<Stu> collect = list.stream().filter(Objects::nonNull).distinct().collect(Collectors.toList());
        System.out.println(collect.size());
        System.out.println(collect);
    }
}
