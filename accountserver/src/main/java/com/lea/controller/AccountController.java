package com.lea.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lea.dao.AdminDao;
import com.lea.dao.UserDao;
import com.lea.entity.TAdmin;
import com.lea.entity.TUser;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AdminDao adminDao;

    @RequestMapping("/login")
    public Object login(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("type") String type){
        Object o=null;
        switch (type){
            case "user":
                QueryWrapper<TUser>queryWrapper=new QueryWrapper<TUser>();
                queryWrapper.eq("username",username);
                queryWrapper.eq("password",password);
                o=userDao.selectOne(queryWrapper);
                break;
            case "admin":
                QueryWrapper<TAdmin>queryWrapper1=new QueryWrapper<TAdmin>();
                queryWrapper1.eq("username",username);
                queryWrapper1.eq("password",password);
                o=adminDao.selectOne(queryWrapper1);
                break;
        }
        return o;
    }

}
