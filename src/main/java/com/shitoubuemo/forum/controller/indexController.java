package com.shitoubuemo.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2023/05/31/10:10
 * @Description:
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
