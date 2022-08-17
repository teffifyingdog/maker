package com.wjc.maker;

import com.wjc.maker.entity.Jts;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.stream.Stream;

public class ReflectionTest {
    public static void main(String[] args) {

    }

    public static void methodTest() {
        Method method = ReflectionUtils.findMethod(Jts.class,"say",String.class);
        Parameter parameter = method.getParameters()[0];
        System.out.println(parameter.getName());
    }
}
