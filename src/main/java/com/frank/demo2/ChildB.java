package com.frank.demo2;

import org.springframework.stereotype.Service;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/3/6 13:44 周三
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Service
public class ChildB implements Panent {
    @Override
    public String a() {
        return "B执行了";
    }
}
