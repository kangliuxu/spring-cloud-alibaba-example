package com.xkl.learning.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xkl
 * @date 2020/3/22
 * @description
 **/
@RefreshScope
@RestController
public class SampleController {
    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int age;

    @GetMapping("userInfo")
    public String getUserInfo(){
        return userName+":"+age;
    }

}
