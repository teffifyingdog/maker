package com.wjc.maker.controller;

import com.wjc.maker.api.RecordApi;
import com.wjc.maker.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/record")
public class RecordController implements RecordApi {
    @Autowired
    private RecordService recordService;

    @PostMapping("/t1")
    @Override
    public long t1() {
        return recordService.count();
    }


}
