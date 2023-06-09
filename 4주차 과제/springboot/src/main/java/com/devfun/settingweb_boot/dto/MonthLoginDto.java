package com.devfun.settingweb_boot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonthLoginDto {
    private Integer totCnt;
    private String yearMonth;
    private Boolean is_success;
}
