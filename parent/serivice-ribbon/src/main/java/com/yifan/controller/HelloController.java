package com.yifan.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 周一凡
 * @Date: 2019-03-05 14:33
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("hi")
    @HystrixCommand(fallbackMethod = "isError")
    public String hi() {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=zyf", String.class);
    }

    public String isError() {
        return "hi,sorry .error";
    }

}
