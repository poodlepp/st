package com.example.st;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: pengyi1
 * @create: 2019-03-15 15:22
 **/


@RestController
@RequestMapping(value = "/hello")
public class DemoController {

    @RequestMapping(value = "/happy")
    public String happy(){
        return "happy";
    }
}
