package com.yifan.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: 周一凡
 * @Date: 2019-03-05 17:05
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hi(String name) {
        return "sorry," + name;
    }
}
