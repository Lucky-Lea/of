package com.lea.controller;

import com.lea.entity.TUser;
import com.lea.entity.UserVO;
import com.lea.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/userClient")
public class UserClientHandler {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page,limit);
    }
    @RequestMapping("/save")
    public String save(TUser tUser){
        tUser.setRegisterdate(new Date());
        userFeign.save(tUser);
        return "redirect:/userClient/redirect/user_manage";
    }
    @RequestMapping("/update")
    public void update(@RequestBody TUser tUser){
        userFeign.update(tUser);
    }
    @RequestMapping("/deleteById")
    public String deleteById(@RequestParam("id") int id){
        userFeign.deleteById(id);
        return "redirect:/userClient/redirect/user_manage";
    }
    @RequestMapping("/findById")
    public TUser findById(@RequestParam("id") int id){
        return userFeign.findById(id);
    }
}
