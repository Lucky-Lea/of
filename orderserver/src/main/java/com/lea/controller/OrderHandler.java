package com.lea.controller;

import com.lea.dao.OrderDao;
import com.lea.entity.OrderVO;
import com.lea.entity.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderDao orderDao;

    @RequestMapping("/save")
    public void save(@RequestBody TOrder order){
        order.setDate(new Date());
        orderDao.save(order);
    }

    @RequestMapping("/findAllByUid")
    public OrderVO findAllByUid(@RequestParam("page") int page, @RequestParam("limit") int limit, @RequestParam("uid") int uid){
        OrderVO orderVO = new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderDao.countByUid(uid));
        orderVO.setData(orderDao.findAllByUid(((page-1)*limit),limit,uid));
        return orderVO;
    }

    @RequestMapping("/findByState")
    public OrderVO findByState(@RequestParam("page") int page, @RequestParam("limit") int limit){
        OrderVO orderVO = new OrderVO();
        orderVO.setMsg("");
        orderVO.setCount(orderDao.countByState());
        orderVO.setData(orderDao.findByState(((page-1)*limit),limit));
        return orderVO;
    }

    @RequestMapping("/updateState")
    public void updateState(@RequestParam("id") int id){
        orderDao.updateState(id);
    }

}
