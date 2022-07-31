package com.wjc.maker.maker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wjc.maker.entity.Event;
import com.wjc.maker.entity.Jts;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Set;

public class JsonToSet {
    private static String s = "";
    private static String SET = "set";
    private static String LEFT = "(";
    private static String RIGHT = ")";
    private static String SEMICOLON = ";";
    private static String NEW_LINE = "\n";
    private static String QUOTE = "\"";
    private static String BIG_DECIMAL_PREFIX = "new BigDecimal(\"";
    private static String NEW = "new ";
    private static String POINT = ".";

    public static void main(String[] args) throws IOException, TemplateException {
        Event event = Event.builder().eventId("a").batchId("b").bizCode("c").ou("d").build();
        Jts jts = Jts.builder().id(1).isMan(true).name("wjc").place(new BigDecimal(1.11)).event(event).build();
        StringBuffer sb = getStringBuffer(jts,"jts",0);
        System.out.println(sb);
    }

    private static StringBuffer getStringBuffer(Object object,String prefix,Integer index) {
        String jsonString = JSON.toJSONString(object);
        JSONObject jsonObject = JSON.parseObject(jsonString);
        Set<String> keySet = jsonObject.keySet();
        StringBuffer sb = new StringBuffer();
        if (index != 0) {
            prefix += index;
        }
        sb.append(newObject(prefix));
        for (String key : keySet) {
            Object obj = jsonObject.get(key);
            if (obj instanceof String) {
                sb.append(prefix).append(POINT)
                        .append(SET)
                        .append(upperCaseFirst(key))
                        .append(LEFT).append(QUOTE)
                        .append(obj.toString())
                        .append(QUOTE).append(RIGHT)
                        .append(SEMICOLON)
                        .append(NEW_LINE);
            }else if (obj instanceof Integer){
                sb.append(prefix).append(POINT)
                        .append(SET)
                        .append(upperCaseFirst(key))
                        .append(LEFT)
                        .append(Integer.valueOf(obj.toString()))
                        .append(RIGHT)
                        .append(SEMICOLON)
                        .append(NEW_LINE);
            }else if (obj instanceof Boolean){
                sb.append(prefix).append(POINT)
                        .append(SET)
                        .append(upperCaseFirst(key))
                        .append(LEFT)
                        .append(Boolean.valueOf(obj.toString()))
                        .append(RIGHT)
                        .append(SEMICOLON)
                        .append(NEW_LINE);
            }else if (obj instanceof BigDecimal){
                sb.append(prefix).append(POINT)
                        .append(SET)
                        .append(upperCaseFirst(key))
                        .append(LEFT).append(BIG_DECIMAL_PREFIX)
                        .append(new BigDecimal(obj.toString()))
                        .append(QUOTE).append(RIGHT).append(RIGHT)
                        .append(SEMICOLON)
                        .append(NEW_LINE);
            }else {
                sb.append(getStringBuffer(obj,prefix,index+1));
                sb.append(prefix).append(POINT)
                        .append(SET)
                        .append(upperCaseFirst(prefix + (index+1)))
                        .append(LEFT)
                        .append(prefix + (index+1))
                        .append(RIGHT)
                        .append(SEMICOLON)
                        .append(NEW_LINE);
            }
        }
        return sb;
    }

    private static String newObject(String objName) {
        return upperCaseFirst(objName)+" "+objName+" "+"="+" "+NEW+upperCaseFirst(objName)+LEFT+RIGHT+SEMICOLON+NEW_LINE;
    }

    private static String upperCaseFirst(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    private static void a(String s) {


    }

}
