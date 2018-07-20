package cn.fcsca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/test")
public class MController{

    //    类型转换用例
    @RequestMapping("/register.do")
    public ModelAndView doRegister(int age, Date birthday) {
        System.out.println("age = " + age);
        System.out.println("birthday = " + birthday);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("birthday", birthday);
        modelAndView.addObject("age", age);
        modelAndView.setViewName("/jsp/welcome.jsp");
        return modelAndView;
    }

}
