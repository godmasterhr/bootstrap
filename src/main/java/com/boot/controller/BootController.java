package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/10/9.
 */
@Controller
public class BootController {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }


}
