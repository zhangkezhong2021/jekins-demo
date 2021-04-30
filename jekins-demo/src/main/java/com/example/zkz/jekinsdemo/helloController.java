package com.example.zkz.jekinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/hello")
public class helloController {
       /**
         * 设置数据，返回到freemarker视图
         * @return
         */
   @RequestMapping("/say")
   public String say(){

      return "springboot 你好！";
    }

}
