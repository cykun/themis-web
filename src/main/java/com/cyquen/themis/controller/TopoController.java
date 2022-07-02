package com.cyquen.themis.controller;

import com.cyquen.themis.model.BgpInfo;
import com.cyquen.themis.service.BgpInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopoController {

    BgpInfoService bgpInfoService;

    public TopoController(BgpInfoService bgpInfoService) {
        this.bgpInfoService = bgpInfoService;
    }

    @GetMapping("/getTopo")
    public String getTopo(@RequestParam String input) {
        System.out.println(input);
        System.out.println("topo");
        return "1";
    }

    @GetMapping("/bgpinfo")
    public List<BgpInfo> getBgpInfos() {
        return bgpInfoService.getBgpInfoList();
    }
}
