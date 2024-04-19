package com.frank.demo3.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frank.demo3.entity.WareIn;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 14:26 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public interface WareInService extends IService<WareIn> {
    boolean savew(WareIn wareIn);
}
