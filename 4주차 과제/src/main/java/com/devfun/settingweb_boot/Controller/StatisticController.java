package com.devfun.settingweb_boot.Controller;

import com.devfun.settingweb_boot.dto.DayLoginDto;
import com.devfun.settingweb_boot.dto.DepartmentLoginDto;
import com.devfun.settingweb_boot.dto.MonthLoginDto;
import com.devfun.settingweb_boot.dto.YearLonginDto;
import com.devfun.settingweb_boot.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StatisticController {

    private final StatisticService service;


    @GetMapping("/yearStatistic")
    public YearLonginDto yearLogin(String year) throws Exception{
        return service.yearloginNum(year);
    }

    @GetMapping("/monthStatistic")
    public MonthLoginDto monthLogin(String year, String month) throws Exception{
        String yearMonth = year + month;
        return service.monthLoginNum(yearMonth);
    }

    @GetMapping("/dayStatistic")
    public DayLoginDto dayLogin(String year, String month, String day) throws Exception{
        String yearMonthDay = year + month + day;
        return service.dayLoginNum(yearMonthDay);
    }

    @GetMapping("/noHolidayMonthStatistic")
    public MonthLoginDto noHolidayMonthLogin(String year, String month) throws Exception{
        String yearMonth = year + month;
        return service.noHolidayMonthLoginNum(yearMonth);
    }

    @GetMapping("/departmentLoginStatistic")
    public List<DepartmentLoginDto> departmentLogin(String year, String month) throws Exception{
        String yearMonth = year + month;
        return service.departmentLoginNum(yearMonth);
    }
}
