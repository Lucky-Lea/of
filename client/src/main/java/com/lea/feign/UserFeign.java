package com.lea.feign;

import com.lea.entity.TUser;
import com.lea.entity.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user")
public interface UserFeign {
    @RequestMapping("/user/findAll")
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit);
    @RequestMapping("/user/save")
    public void save(@RequestBody TUser tUser);
    @RequestMapping("/user/update")
    public void update(@RequestBody TUser tUser);
    @RequestMapping("/user/deleteById")
    public void deleteById(@RequestParam("id") int id);
    @RequestMapping("/user/findById")
    public TUser findById(@RequestParam("id") int id);


}
