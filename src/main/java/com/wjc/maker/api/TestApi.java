package com.wjc.maker.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@Api("TestApi")
public interface TestApi {
    @ApiOperation(value = "t1")
    public long t1();
}
