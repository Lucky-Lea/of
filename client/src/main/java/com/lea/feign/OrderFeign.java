package com.lea.feign;

import com.lea.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "order")
public interface OrderFeign {
    @PostMapping("/order/save")
    void save(@RequestBody TOrder order);

    @RequestMapping("/order/findAllByUid")
    OrderVO findAllByUid(@RequestParam("page") int page, @RequestParam("limit") int limit, @RequestParam("uid") int uid);

    @RequestMapping("/order/findByState")
    OrderVO findByState(@RequestParam("page") int page, @RequestParam("limit") int limit);

    @RequestMapping("/order/updateState")
    void updateState(@RequestParam("id") int id);
}
