package com.yifan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 周一凡
 * @Date: 2019-03-05 14:51
 * @Description:
 */
@FeignClient(value = "service-hi", fallback = HelloServiceImpl.class)
//@FeignClient(value = "service-hi")
public interface HelloService {

    @RequestMapping("hi")
    String hi(@RequestParam(value = "name") String name);
}
