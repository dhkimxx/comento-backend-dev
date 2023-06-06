package com.devfun.settingweb_boot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class StatisticDto {
    private Integer totCnt;
    private String year;
    private Boolean is_success;

}
