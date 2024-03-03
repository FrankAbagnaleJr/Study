package com.frank.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther: frank gee
 * @date: 2024-3-3 15:03 周日
 * @project_name: Study
 * @version: 1.0
 * @description TODO
 */
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class User1 extends User{
    private String a;

    public User1(Long id, String name, Integer age, String a) {
        super(id, name, age);
        this.a = a;
    }
}
