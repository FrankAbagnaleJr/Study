package com.frank.demo3;

import com.frank.demo3.entity.WareIn;
import com.frank.demo3.service.WareInService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Auther: uicsoft-frank
 * @Date: 2024/4/19 13:55 周五
 * @Project_Name: Study
 * @Version: 1.0
 * @description TODO
 */
@RestController
@AllArgsConstructor
@RequestMapping("/demo3")
public class Demo3 {

    private final WareInService wareInService;
    /**
     * 测试事务直接里面，this调用会不会导致事务失效
     */
    @GetMapping("/run")
    public String run() {
        //添加入库
        WareIn wareIn = new WareIn();
        wareIn.setWareInNo("RK20240419-01");
        wareIn.setWareInTime(LocalDateTime.now());
        wareIn.setWareInStatus(0);
        wareIn.setWareInType(0);
        boolean savew = wareInService.savew(wareIn);
        if (savew) {
            return "添加成功";
        }
        return "添加失败";
    }
}
