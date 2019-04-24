package cn.lifecycle.controller;

import cn.lifecycle.service.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.text.normalizer.NormalizerBase;


@Controller
public class HelloController {
    @Autowired
    private ControllerService service;

    @RequestMapping("/hello")
    public String hello(Model model){
       model.addAttribute("name",service.getMessage());
        return "/hello1";
    }
}
