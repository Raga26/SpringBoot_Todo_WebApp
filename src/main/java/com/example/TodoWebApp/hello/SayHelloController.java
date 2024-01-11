package com.example.TodoWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

@RequestMapping("sayHello")
public String sayHello(){
    System.out.println("hi");
    return "home";
 }

}
