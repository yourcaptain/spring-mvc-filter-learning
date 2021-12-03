package net.yesdata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
    @Value("test.value")
    private String testValue;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("response: " + testValue);
        return testValue;
    }
}
