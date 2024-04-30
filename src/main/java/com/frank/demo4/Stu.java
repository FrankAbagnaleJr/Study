package com.frank.demo4;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/29 16:19 周一
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Data
@Accessors(chain = true)
public class Stu {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthday;
    private List<Usr> list;
}
