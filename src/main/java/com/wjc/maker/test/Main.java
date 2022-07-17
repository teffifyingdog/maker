package com.wjc.maker.test;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiMediaUploadRequest;
import com.dingtalk.api.response.OapiMediaUploadResponse;
import com.taobao.api.ApiException;
import com.taobao.api.FileItem;

public class Main {
    public static void main(String[] args) {
        try {
            DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/media/upload");
            OapiMediaUploadRequest req = new OapiMediaUploadRequest();
            req.setType("file");
            req.setMedia(new FileItem("C:\\Users\\28600\\Desktop\\333335t(1).xls"));
            OapiMediaUploadResponse rsp = client.execute(req, "188f047e34a633d48c5c09e9231e63fd");
            System.out.println(rsp.getBody());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
