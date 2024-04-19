package com.frank.demo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frank.demo3.entity.WareIn;
import com.frank.demo3.entity.WareInDetail;
import com.frank.demo3.mapper.WareInMapper;
import com.frank.demo3.service.WareInDetailService;
import com.frank.demo3.service.WareInService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 14:27 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Service
@AllArgsConstructor
public class WareInDetailServiceImpl extends ServiceImpl<WareInMapper, WareIn> implements WareInService {
    private final WareInDetailService wareInDetailService;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean savew(WareIn wareIn) {
        boolean save = this.save(wareIn);
        WareInDetail wareInDetail = new WareInDetail();
        wareInDetail.setWareInId(wareIn.getId());
        wareInDetail.setWareInNum(100L);
        wareInDetail.setProdId(1254854425L);
        boolean save1 = wareInDetailService.save(wareInDetail);

        if (true) {
            throw new RuntimeException("模拟发生异常");
        }
        return save && save1;
    }
}