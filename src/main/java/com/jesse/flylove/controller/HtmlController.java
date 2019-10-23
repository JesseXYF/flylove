package com.jesse.flylove.controller;

import com.jesse.flylove.dto.PhotoTexts;
import com.jesse.flylove.service.PhotoTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 22:01 2019/10/17
 **/
@Controller
public class HtmlController {

    @Autowired
    private PhotoTextService photoTextService;
    @RequestMapping(value = "/photoDetail", method = RequestMethod.GET)
    public String getShowDetail(@RequestParam("num") int num, Model model) {
        try {
            PhotoTexts photoTexts = photoTextService.getById(num);
            model.addAttribute("photoText", photoTexts.getTexts());
        } catch (Exception e) {
            System.out.println(e);
            model.addAttribute("photoText", "一生一世的爱");
        }
        return "photo_detail";
    }
}
