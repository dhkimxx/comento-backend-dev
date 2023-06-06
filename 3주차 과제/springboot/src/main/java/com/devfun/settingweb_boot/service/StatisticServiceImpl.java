package com.devfun.settingweb_boot.service;


import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class StatisticServiceImpl implements StatisticService {


    private final StatisticMapper uMapper;

    @Override
    public StatisticDto yearloginNum (String year) {

        StatisticDto retVal = new StatisticDto();

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
}