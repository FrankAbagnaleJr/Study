package com.frank.demo3.vo;

import com.frank.demo3.entity.WareInDetail;
import lombok.Data;

import java.util.List;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 15:55 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Data
public class WareInVo extends WareInDetail {
    List<WareInDetail> list;
}
