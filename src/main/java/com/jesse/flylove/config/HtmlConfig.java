package com.jesse.flylove.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 22:29 2019/10/17
 **/
@Configuration
public class HtmlConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index").setViewName("index.html");
    }
}
