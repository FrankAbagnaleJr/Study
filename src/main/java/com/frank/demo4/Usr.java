package com.frank.demo4;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/29 16:39 周一
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Data
@Accessors(chain = true)
public class Usr {
    private Long id;
    private String name;
}
