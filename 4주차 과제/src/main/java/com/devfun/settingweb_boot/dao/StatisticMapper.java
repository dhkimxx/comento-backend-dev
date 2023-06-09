package com.devfun.settingweb_boot.dao;

import com.devfun.settingweb_boot.dto.DayLoginDto;
import com.devfun.settingweb_boot.dto.DepartmentLoginDto;
import com.devfun.settingweb_boot.dto.YearLonginDto;
import com.devfun.settingweb_boot.dto.MonthLoginDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface  StatisticMapper {
    YearLonginDto selectYearLogin(String year);

    MonthLoginDto selectMonthLogin(String yearMonth);

    DayLoginDto selectDayLogin(String yearMonthDay);

    MonthLoginDto selectNoHolidayMonthLogin(String yearMonth);

    List<DepartmentLoginDto> selectDepartmentLogin(String yearMonth);
}