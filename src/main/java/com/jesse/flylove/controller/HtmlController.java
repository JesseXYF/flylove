package com.jesse.flylove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 22:01 2019/10/17
 **/
@Controller
public class HtmlController {

    @RequestMapping(value = "/photoDetail",method = RequestMethod.GET)
    public String getShowDetail(){
        return "photo_detail";
    }
}
