package com.devfun.settingweb_boot.service;

import com.devfun.settingweb_boot.dto.DayLoginDto;
import com.devfun.settingweb_boot.dto.DepartmentLoginDto;
import com.devfun.settingweb_boot.dto.YearLonginDto;
import com.devfun.settingweb_boot.dto.MonthLoginDto;

import java.util.List;
import java.util.Map;

public interface StatisticService {
    YearLonginDto yearloginNum(String year);

    MonthLoginDto monthLoginNum(String yearMonth);

    DayLoginDto dayLoginNum(String yearMonthDay);

    MonthLoginDto noHolidayMonthLoginNum(String yearMonth);

    List<DepartmentLoginDto> departmentLoginNum(String yearMonth);
}
