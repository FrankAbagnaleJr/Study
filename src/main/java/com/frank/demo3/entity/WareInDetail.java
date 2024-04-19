package com.frank.demo3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 14:21 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Data
@TableName("uic_ware_in_detail")
public class WareInDetail {
    private Long id;
    private Long wareInId;
    private Long wareInNum;
    private Long prodId;
}
