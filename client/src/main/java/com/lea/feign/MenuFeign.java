package com.lea.feign;

import com.lea.entity.MenuVo;
import com.lea.entity.TMenu;
import com.lea.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @RequestMapping("/menu/findAll")
     List<TMenu> findAll();

    @RequestMapping("/menu/findAllByPage")
    MenuVo findAllByPage(@RequestParam("page") int page, @RequestParam("limit") int limit);

    @RequestMapping("/menu/findAllByPageXml")
    MenuVo findAllByPageXml(@RequestParam("page") int page, @RequestParam("limit") int limit);

    @RequestMapping("/menu/deleteById")
    void deleteById(@RequestParam("id") int id);

    @RequestMapping("/menu/findAllType")
    List<Type> findAllType();

    @RequestMapping("/menu/findById")
    TMenu findById(@RequestParam("id") int id);

    @PostMapping("/menu/save")
    void save(@RequestBody TMenu menu);

    @PostMapping("/menu/update")
    void update(TMenu menu);
}
