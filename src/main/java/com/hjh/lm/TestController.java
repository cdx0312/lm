package com.hjh.lm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/a")
    @ResponseBody
    public String say(){
        return "hi";
    }
}
