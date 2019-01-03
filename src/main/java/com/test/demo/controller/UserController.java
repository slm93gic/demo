package com.test.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author admin
 */
@RestController
public class UserController {

    @RequestMapping(value = "say")
    public String say() {
        return "hello world";
    }

    @RequestMapping(value = "say2")
    public String say1() {
        return "hello world1";
    }
}
