package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.devfun.settingweb_boot.dto.StatisticDto;
import com.devfun.settingweb_boot.service.StatisticService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @ResponseBody
    @RequestMapping("/sqlyearStatistic")
    public StatisticDto sqltest(String year) throws Exception{
        return service.yearloginNum(year);
    }
}