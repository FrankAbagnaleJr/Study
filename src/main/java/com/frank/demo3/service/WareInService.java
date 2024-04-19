package com.frank.demo3.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frank.demo3.entity.WareIn;
import com.frank.demo3.entity.WareInDetail;
import com.frank.demo3.vo.WareInVo;

import java.util.List;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 14:26 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
public interface WareInService extends IService<WareIn> {
    WareIn savew(WareIn wareIn);


    WareIn getOneById(Long id);

    List<WareIn> getAll();

    List<WareInVo> getInList();

    List<WareInDetail> testchain();
}
