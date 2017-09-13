package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by jianjunliu on 2017-09-10.
 */

@Controller
public class GifController {

    //TODO Notice: Dependency injection @Autowired: no need to initialize field
    @Autowired
    private GifRepository gifRepository;

    //RequestMapping: map web request to spring controller
    //ResponseBody: method listGifs() return value should be bound to web response body, WITHOUT Further processing
    //when not needed: make sure thymeleaf knows which view to use. return: html file name
    //TODO Notice: User request DNS: localhost:8080 <=> ("/"); Return: resource <=> home.html
    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getAllGifs();

        modelMap.put("gifs", gifs);
        return "home";
    }

    //<1> MVC flow:
    //inside Controller: user request path(/gif) => Model object => ModelMap => View
    //ModelMap<String:Picture name, Object:Model object>

    //<2> Todo Notice: Dynamic gifDetails page & @PathVariable
    //Step1: web url dynamic request: /gif/{name}
    //Step2: @PathVariable -- Request:{name} captured into PathVariable:name  (Todo Notice: two names are same)
    //Step3: dynamic Model object creation (Gif)
    //Step4: update View -- Controller "gif" corresponds to gif-details.html $gif
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {

        Gif gif = gifRepository.findByName(name);

        modelMap.put("gif", gif);

        return "gif-details";
    }
}

