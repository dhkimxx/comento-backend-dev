package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;

import com.devfun.settingweb_boot.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class settingTest {

    private final StatisticService service;

    @RequestMapping("/test")
    public String test(Model model) throws Exception{
        model.addAttribute("name", "devfunpj");
        List<String> resultList = new ArrayList<String>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        model.addAttribute("list", resultList);
        return "test";
    }
}