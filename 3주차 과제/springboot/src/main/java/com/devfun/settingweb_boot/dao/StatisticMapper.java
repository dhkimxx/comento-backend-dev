package com.devfun.settingweb_boot.dao;
import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface  StatisticMapper {
    StatisticDto selectYearLogin(String year);

}