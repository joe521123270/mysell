package com.immooc.sell.controller;

import com.immooc.sell.dataobject.pojo.HomeData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sell")
public class HomeController {

    @PostMapping("/test")
    public void test(HomeData data){
        System.out.println(data);
    }
}
