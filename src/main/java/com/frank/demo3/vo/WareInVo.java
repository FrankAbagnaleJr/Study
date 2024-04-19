package com.frank.demo3.vo;

import com.frank.demo3.entity.WareIn;
import com.frank.demo3.entity.WareInDetail;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 15:55 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@Data
public class WareInVo extends WareIn {

    List<WareInDetail> list;
    @Override
    public String toString() {
        //因为不能直接访问父类中的私有属性，的通过get和set方法访问
        return "WareInVo{" +
                "id=" + this.getId() +
                ", wareInNo=" + this.getWareInNo() +
                ", wareInTime=" + this.getWareInTime() +
                ", wareInType=" + this.getWareInType() +
                ", wareInStatus=" + this.getWareInStatus() +
                ", list=" + list +
                '}';
    }
}
