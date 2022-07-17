package com.wjc.maker.test;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ComplexHeadData {
    @ExcelProperty({"分组"})
    private String groupId;
    @ExcelProperty({"账单单号"})
    private String billId;
}
