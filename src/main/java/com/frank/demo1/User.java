package com.frank.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: frank gee
 * @date: 2024-3-3 15:13 周日
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
}
