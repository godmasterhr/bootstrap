package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**
 * Created by Administrator on 2017/10/9.
 */
@Controller
public class BootController {

    @RequestMapping("/{n}")
    public String toIndex(@PathVariable String n){
        return n;
    }



}
