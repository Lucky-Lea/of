package com.lea.controller;


import com.lea.entity.*;
import com.lea.feign.AccountFeign;
import com.lea.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

@RequestMapping("/orderClient")
@Controller
public class OrderClientHandler {

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/save")
    public String save(@RequestParam("mid") int mid,HttpSession session){
        TUser user= (TUser) session.getAttribute("user");
        TOrder order=new TOrder();
        order.setUser(user);
        TMenu menu = new TMenu();
        menu.setId(mid);
        order.setMenu(menu);
        orderFeign.save(order);
        return "order";
    }

    @RequestMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @RequestMapping("/findAllByUid")
    @ResponseBody
    OrderVO findAllByUid(@RequestParam("page") int page, @RequestParam("limit") int limit, HttpSession session){
       TUser user= (TUser) session.getAttribute("user");
        OrderVO allByUid = orderFeign.findAllByUid(page, limit, user.getId());
        return allByUid;
    }

    @RequestMapping("/findByState")
    @ResponseBody
    OrderVO findByState(@RequestParam("page") int page, @RequestParam("limit") int limit){
        OrderVO allByUid = orderFeign.findByState(page, limit);
        return allByUid;
    }

    @RequestMapping("/updateState")
    String updateState(@RequestParam("id") int id){
        orderFeign.updateState(id);
        return "order_handler";
    }


}
