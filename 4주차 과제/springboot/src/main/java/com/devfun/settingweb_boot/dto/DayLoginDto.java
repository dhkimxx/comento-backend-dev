package com.devfun.settingweb_boot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DayLoginDto {
    private Integer totCnt;
    private String yearMonthDay;
    private boolean is_success;
}
