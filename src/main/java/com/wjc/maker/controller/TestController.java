package com.wjc.maker.controller;

import com.wjc.maker.api.TestApi;
import com.wjc.maker.entity.Test;
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

    @PostMapping("/t2")
    @Override
    public long t2() {
        System.out.println(1);
        System.out.println(2);
        return 1L;
    }

    private static String s = "一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远一永远永远";

    public static void main(String[] args) {
        System.out.println("s.length() = " + s.length());
    }

    @PostMapping("/t3")
    @Override
    public boolean t3() {
        String ex = "";
        for (int i = 0; i < 20; i++) {
            ex = ex + s;
        }
        ex = ex+".";
        String finalEx = ex;
        System.out.println("ex.length() = " + finalEx.length());
        return testService.save(new Test() {{
            setExtendInfo(finalEx);
        }});
    }

}
