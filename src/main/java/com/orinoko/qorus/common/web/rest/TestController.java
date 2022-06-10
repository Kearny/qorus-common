package com.orinoko.qorus.common.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

        @RequestMapping("/hello")
        public String hello() {
            log.info("hello");
            return "hello";
        }
}
