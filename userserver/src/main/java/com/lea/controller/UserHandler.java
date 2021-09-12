package com.lea.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lea.entity.TUser;
import com.lea.entity.UserVO;
import com.lea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return this.port;
    }

    @RequestMapping("/findAll")
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        List<TUser> list=userService.findAll(page,limit).getRecords();
        int total=(int) userService.findAll(page,limit).getTotal();
        UserVO userVO = new UserVO(0,"", total,list);
        return userVO;
    }
    @RequestMapping("/save")
    public void save(@RequestBody TUser tUser){
        userService.save(tUser);
    }
    @RequestMapping("/update")
    public void update(@RequestBody TUser tUser){
        userService.update(tUser);
    }
    @RequestMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        userService.deleteById(id);
    }
    @RequestMapping("/findById")
    public TUser findById(@RequestParam("id") int id){
       return userService.findById(id);
    }
}
