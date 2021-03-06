package com.xkl.learning.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xkl
 * @date 2020/3/22
 * @description
 **/
@RestController
public class EchoComsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    @GetMapping("/echo-rest/{str}" )
    public String rest(@PathVariable String str){
        return restTemplate.getForObject("http://service-provider/echo/"+str,String.class);
    }

    @GetMapping("/echo-feign/{str}")
    public String feign(@PathVariable String str){
        return echoService.echo(str);
    }


}
