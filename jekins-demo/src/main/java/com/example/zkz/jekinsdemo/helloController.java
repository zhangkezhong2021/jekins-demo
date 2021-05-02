package com.example.zkz.jekinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class helloController {
       /**
         * 设置数据，返回到freemarker视图
         * @return
         */
   @RequestMapping("/index")
   public String say(){
        return "index.html";
    }

}
