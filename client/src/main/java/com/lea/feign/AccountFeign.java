package com.lea.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "account")
public interface AccountFeign {

    @RequestMapping("/account/login")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type);
}
