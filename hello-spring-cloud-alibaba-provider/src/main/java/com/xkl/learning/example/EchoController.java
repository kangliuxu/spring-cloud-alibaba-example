package com.xkl.learning.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xkl
 * @date 2020/3/22
 * @description
 **/
@RefreshScope
@RestController
public class EchoController {

    @Value("${user.name}")
    private String name;

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string){
        return string+":"+name;
    }
}
