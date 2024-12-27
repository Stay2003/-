package cn.net.susan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/3 下午3:59
 */
@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
