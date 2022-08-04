package tech.yeez.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.yeez.boot.model.entity.HelloWorld;
import tech.yeez.boot.service.IHelloWorldService;

/**
 * @description: asset
 * @author: xiangbin
 * @create: 2022-04-21 08:50
 **/
@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @Autowired
    private IHelloWorldService helloWorldService;

    @GetMapping(value = "/world")
    public String helloWorld() {

        return "hello world";
    }

    @GetMapping(value = "/getById")
    public String getNameById(@RequestParam(required = false) Integer id) {
        HelloWorld helloWorld = helloWorldService.getById(id);
        if (helloWorld != null && StringUtils.isNotBlank(helloWorld.getName())) {
            return helloWorld.getName();
        }
        return "default";
    }
}
