package net.yesdata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class TestController {
    @Value("${test.value}")
    private String testValue;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("/test: " + testValue + " -- " + Thread.currentThread().getName());
        return testValue;
    }


    @RequestMapping("/")
    @ResponseBody
    public String root(){
        System.out.println("/ " + Thread.currentThread().getName());
        return testValue;
    }
}
