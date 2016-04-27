/*
 * Copyright (c) 2016 chenchi.me. All Rights Reserved.
 */
package controller;

import common.ApiResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author chichen  Date: 16-4-27 Time: 下午3:07
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * ResponseBody表示该方法的返回结果直接写入HTTP response body中
     * 一般在异步获取数据时使用，在使用@RequestMapping后，返回值通常解析为跳转路径，
     * 加上ResponseBody后返回结果不会被解析为跳转路径，而是直接写入HTTP response body中
     * 比如异步获取json数据，加上ResponseBody后，会直接返回json数据
     */
    @RequestMapping(value = "hello.json", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult sayHello() {
        return ApiResult.succ("hi, there");
    }

    @RequestMapping(value = "welcome.json", method = RequestMethod.GET)
    @ResponseBody
    public String sayWelcome() {
        return "welcome";
    }

    @RequestMapping(value = "hi.htm", method = RequestMethod.GET)
    public ModelAndView sayHi() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("hi", "hi");

        return mv;
    }

    @RequestMapping(value = "there.htm", method = RequestMethod.GET)
    public String sayThere(Model model) {
        model.addAttribute("hi", "there~");

        return "hello";
    }
}
