package com.yifan.controller;

import com.yifan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 周一凡
 * @Date: 2019-03-05 14:52
 * @Description:
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @GetMapping("hi")
    public String getHi(@RequestParam(value = "name",required = true,defaultValue = "springcloud") String name) {
        return helloService.hi(name);
    }
}
