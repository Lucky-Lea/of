package com.lea.controller;


import com.lea.entity.MenuVo;
import com.lea.entity.TMenu;
import com.lea.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/menuClient")
@Controller
public class MenuClientHandler {

    @Autowired
    private MenuFeign menuFeign;

    @RequestMapping("/findAll")
    public List<TMenu> findAll(){
        return menuFeign.findAll();
    }

    @RequestMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @RequestMapping("/findAllByPage")
    @ResponseBody
    public MenuVo findAllByPage(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return menuFeign.findAllByPage(page,limit);
    }

    @RequestMapping("/findAllByPageXml")
    @ResponseBody
    public MenuVo findAllByPageXml(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return menuFeign.findAllByPageXml(page,limit);
    }

    @RequestMapping("/deleteById")
    public String deleteById(@RequestParam("id") int id){
         menuFeign.deleteById(id);
         return "redirect:/menuClient/redirect/menu_manage";
    }

    @RequestMapping("/findTypes")
    public ModelAndView findTypes(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("menu_add");
        modelAndView.addObject("list",menuFeign.findAllType());
        return modelAndView;
    }

    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam("id") int id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("menu_update");
        modelAndView.addObject("menu",menuFeign.findById(id));
        modelAndView.addObject("list",menuFeign.findAllType());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(TMenu menu){
        menuFeign.save(menu);
        return "redirect:/menuClient/redirect/menu_manage";
    }

    @PostMapping("/update")
    public String update(TMenu menu){
        menuFeign.update(menu);
        return "redirect:/menuClient/redirect/menu_manage";
    }
}
