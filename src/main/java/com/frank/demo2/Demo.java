package com.frank.demo2;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/3/6 13:39 周三
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@RestController
@RequestMapping("/demo2")
@AllArgsConstructor
public class Demo {
    private final Panent childA;
    private final Panent childB;
    /**
     * 接口有多个实现类，注入接口会调用哪个实现
     * 注入的时候变量名要写实现类的名字，就会按照名字注入，这时候如果自定义变量名将会出错
     * @param
     */
    @GetMapping("/run")
    public String demo() {
        return childA.a() + " | " + childB.a();
    }

}
