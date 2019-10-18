package com.jesse.flylove.controller;

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

    @RequestMapping(value = "/photoDetail", method = RequestMethod.GET)
    public String getShowDetail(@RequestParam("num") int num, Model model) {
        try {
            File directory = new File("");//参数为空
            String courseFile = directory.getCanonicalPath();
            String[] localPath  =courseFile.split("/target");
            FileReader reader = new FileReader(localPath[0] + "/src/main/java/com/jesse/flylove/dto/photos.txt");
            BufferedReader buf = new BufferedReader(reader);
            String s;
            String textValue = "";
            int i = 1;
            while ((s = buf.readLine()) != null) {
                if (i == num) {
                    textValue = s;
                    break;
                }
                i++;
            }
            reader.close();
            buf.close();
            model.addAttribute("photoText", textValue);
        } catch (IOException e) {
            System.out.println(e);
            model.addAttribute("photoText", "一生一世的爱");
        }
        return "photo_detail";
    }
}
