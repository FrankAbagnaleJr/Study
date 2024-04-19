package com.frank.demo3.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frank.demo3.entity.WareInDetail;
import com.frank.demo3.mapper.WareInDetailMapper;
import com.frank.demo3.service.WareInDetailService;
import org.springframework.stereotype.Service;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 14:27 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Service
public class WareInServiceImpl extends ServiceImpl<WareInDetailMapper, WareInDetail> implements WareInDetailService {
    @Override
    public boolean savewd(WareInDetail wareInDetail) {
        return false;
    }
}
