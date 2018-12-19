package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Curlary
 * @Description:
 * @Date:Created in ${Time} ${Data}
 */
@RestController
public class HelloWordController {
    @RequestMapping("/springboot")
    public String Hello() {
        return "Hello SpringBoot!";
    }
}