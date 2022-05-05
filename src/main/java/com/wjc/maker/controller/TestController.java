package com.wjc.maker.controller;

import com.wjc.maker.api.TestApi;
import com.wjc.maker.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class TestController implements TestApi {
    @Autowired
    private TestService testService;

    @PostMapping("/t1")
    @Override
    public long t1() {
        return testService.count();
    }

}
