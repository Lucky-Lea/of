package com.lea.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lea.entity.MenuVo;
import com.lea.entity.TMenu;
import com.lea.entity.Type;
import com.lea.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuService menuService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "order的端口:"+this.port;
    }

    @RequestMapping("/findAll")
    public List<TMenu> findAll(){
        List<TMenu> list=menuService.findAll();
        return list;
    }

    @RequestMapping("/findAllByPage")
    public MenuVo findAllByPage(@RequestParam("page") int page,@RequestParam("limit") int limit){
        IPage<TMenu> iPage=menuService.findAllByPage( page, limit);
        int  total=(int)iPage.getTotal();
        MenuVo menuVo = new MenuVo(0,"", total,iPage.getRecords());
        return menuVo;
    }

    @RequestMapping("/findAllByPageXml")
    public MenuVo findAllByPageXml(@RequestParam("page") int page,@RequestParam("limit") int limit){
        List<TMenu> list=menuService.findAllByPageXml( page, limit);
        int total=menuService.findCount();
        MenuVo menuVo = new MenuVo(0,"", total,list);
        return menuVo;
    }

    @RequestMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        menuService.deleteById(id);
    }

    @RequestMapping("/findAllType")
    public List<Type> findAllType(){
        return menuService.findAllType();
    }

    @RequestMapping("/findById")
    public TMenu findById(@RequestParam("id") int id){
        return menuService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody TMenu menu){
        menuService.save(menu);
    }

    @PostMapping("/update")
    public void update(@RequestBody TMenu menu){
        menuService.update(menu);
    }

}
