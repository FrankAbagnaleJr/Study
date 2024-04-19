package com.frank.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @auther: frank gee
 * @date: 2024-3-24 18:32 周日
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String name;
    private Integer age;
    private List list;
}
