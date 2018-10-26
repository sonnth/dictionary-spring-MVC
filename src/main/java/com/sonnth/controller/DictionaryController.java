package com.sonnth.controller;

import com.sonnth.service.Dictionary;
import com.sun.istack.internal.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class DictionaryController {

    Dictionary dictionary = new Dictionary();

    @GetMapping
    public ModelAndView homeDisplay() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("/translate")
    public String translate(@RequestParam String eng, Model model){
        String vi = dictionary.getVi(eng);
        model.addAttribute("vi",vi);
        return "index";
    }
}
