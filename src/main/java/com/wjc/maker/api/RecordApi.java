package com.wjc.maker.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

@Api("TestApi")
public interface RecordApi {
    @ApiOperation(value = "t1")
    public long t1();

}
