package com.frank.demo8;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.frank.demo3.entity.WareInDetail;
import com.frank.demo3.service.WareInDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/30 14:02 周二
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@RestController
@AllArgsConstructor
public class Demo8 {
    private final WareInDetailService wareInDetailService;

    public  void a() {
        //likeLeft(column, value)    column字段,value是模糊查找的值，例如：name,"欢"，查找就是like '%欢'
        //likeRight(column, value)  column字段,value是模糊查找的值，例如：name,"欢"，查找就是like '欢%'
//        wareInDetailService.getOne(Wrappers.<WareInDetail>lambdaQuery().likeRight())
    }
}
