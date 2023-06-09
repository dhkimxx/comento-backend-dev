package com.devfun.settingweb_boot.service;


import com.devfun.settingweb_boot.dto.DayLoginDto;
import com.devfun.settingweb_boot.dto.DepartmentLoginDto;
import com.devfun.settingweb_boot.dto.YearLonginDto;
import com.devfun.settingweb_boot.dto.MonthLoginDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StatisticServiceImpl implements StatisticService {

    private final StatisticMapper uMapper;

    @Override
    public YearLonginDto yearloginNum (String year) {
        YearLonginDto retVal = new YearLonginDto();
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.setYear(year);
            retVal.setIs_success(true);
        }catch(Exception e) {
            log.error(String.valueOf(e));
            retVal.setTotCnt(-999);
            retVal.setYear(year);
            retVal.setIs_success(false);
        }
        return retVal;
    }

    @Override
    public MonthLoginDto monthLoginNum(String yearMonth) {
        MonthLoginDto retVal = new MonthLoginDto();
        try {
            retVal = uMapper.selectMonthLogin(yearMonth);
            retVal.setYearMonth(yearMonth);
            retVal.setIs_success(true);
        }catch (Exception e){
            log.error(String.valueOf(e));
            retVal.setTotCnt(-999);
            retVal.setYearMonth(yearMonth);
            retVal.setIs_success(false);
        }
        return retVal;
    }

    @Override
    public DayLoginDto dayLoginNum(String yearMonthDay) {
        DayLoginDto retVal = new DayLoginDto();
        try {
            retVal = uMapper.selectDayLogin(yearMonthDay);
            retVal.setYearMonthDay(yearMonthDay);
            retVal.set_success(true);
        }catch (Exception e){
            log.error(String.valueOf(e));
            retVal.setTotCnt(-999);
            retVal.setYearMonthDay(yearMonthDay);
            retVal.set_success(false);
        }
        return retVal;
    }

    @Override
    public MonthLoginDto noHolidayMonthLoginNum(String yearMonth) {
        MonthLoginDto retVal = new MonthLoginDto();
        try {
            Integer holidayLogin = uMapper.selectHolidayLogin(yearMonth);
            retVal = uMapper.selectMonthLogin(yearMonth);
            retVal.setTotCnt(retVal.getTotCnt() - holidayLogin);
            retVal.setYearMonth(yearMonth);
            retVal.setIs_success(true);
        }catch (Exception e){
            log.error(String.valueOf(e));
            retVal.setTotCnt(-999);
            retVal.setYearMonth(yearMonth);
            retVal.setIs_success(false);
        }
        return retVal;
    }

    @Override
    public List<DepartmentLoginDto> departmentLoginNum(String yearMonth) {
        try {
            List<DepartmentLoginDto> retVal = uMapper.selectDepartmentLogin(yearMonth);
            return retVal;
        } catch (Exception e) {
            log.error(String.valueOf(e));
            return new ArrayList<>();
        }
    }
}