package com.lea.controller;


import com.lea.entity.MenuVo;
import com.lea.entity.TAdmin;
import com.lea.entity.TMenu;
import com.lea.entity.TUser;
import com.lea.feign.AccountFeign;
import com.lea.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.List;

@RequestMapping("/accountClient")
@Controller
public class AccountClientHandler {

    @Autowired
    private AccountFeign accountFeign;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session){
        Object o=accountFeign.login(username, password, type);
        LinkedHashMap<String,Object> linkedHashMap= (LinkedHashMap<String, Object>) o;
         String result=null;
         if (o==null){
             result="login";
         }else {
             switch (type){
                 case "user":
                     int id= (int) linkedHashMap.get("id");
                     String nickname= (String) linkedHashMap.get("nickname");
                     TUser user=new TUser();
                     user.setId(id);
                     user.setNickname(nickname);
                     session.setAttribute("user",user);
                     result="index";
                     break;
                 case "admin":
                     int id1= (int) linkedHashMap.get("id");
                     String username1= (String) linkedHashMap.get("username");
                     TAdmin admin=new TAdmin();
                     admin.setId(id1);
                     admin.setUsername(username1);
                     session.setAttribute("admin",admin);
                     result="main";
                     break;
             }
         }
         return result;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }

    @RequestMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

}
