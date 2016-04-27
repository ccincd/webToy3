/*
 * Copyright (c) 2016 chenchi.me. All Rights Reserved.
 */
package controller;

import common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chichen  Date: 16-4-27 Time: 下午3:07
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "hello.json", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult sayHello() {
        return ApiResult.succ("hi, there");
    }
}
