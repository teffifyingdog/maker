package com.wjc.maker.test;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class ExeclWriter {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\28600\\Desktop\\complexHeadWrite" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        EasyExcel.write(fileName, ComplexHeadData.class).sheet("模板").doWrite(data());
    }
    private  static List<ComplexHeadData> data(){
        ArrayList<ComplexHeadData> list = new ArrayList<>();
        long bi = 100000000000000000L;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                ComplexHeadData data = new ComplexHeadData();
                data.setGroupId(i+"");
                data.setBillId(bi+"");
                bi++;
                list.add(data);
            }
        }
        return list;
    }
}
