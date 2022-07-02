package com.cyquen.themis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping({"index", ""})
    public String index(ModelMap map) {
        return "index";
    }

    @GetMapping("topo")
    public String topo() {
        return "topo";
    }
}
