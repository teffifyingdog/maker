package com.wjc.maker.entity;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jts {
    private Integer id;
    private String name;
    private BigDecimal place;
    private Boolean isMan;
    private Event event;
}
