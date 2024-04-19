package com.frank.demo3;

import com.frank.demo3.entity.WareIn;
import com.frank.demo3.service.WareInService;
import com.frank.demo3.vo.WareInVo;
import lombok.AllArgsConstructor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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
        WareIn ware = wareInService.savew(wareIn);
        if (Objects.isNull(ware)) {
            return "添加失败";
        }
        return ware.toString();
    }

    @GetMapping("/get")
    public String get() {
        List<WareIn> list = wareInService.list();
        WareIn ware = wareInService.getOneById(list.get(0).getId());
        if (Objects.isNull(ware)) {
            return "查询失败";
        }
        return ware.toString();
    }

    @GetMapping("/all")
    public String getall(){
        List<WareIn> list = wareInService.getAll();
        return list.toString();
    }

    @GetMapping("/getInList")
    public String getInList(){
        List<WareInVo> ware = wareInService.getInList();
        return ware.toString();
    }
}
