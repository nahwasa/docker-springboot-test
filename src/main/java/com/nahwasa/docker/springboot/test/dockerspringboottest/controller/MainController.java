package com.nahwasa.docker.springboot.test.dockerspringboottest.controller;

import com.nahwasa.docker.springboot.test.dockerspringboottest.Entity.MainResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class MainController {
    private static final String testVersion = "1.3";

    @RequestMapping
    public String root() {
        return "ok";
    }

    @GetMapping("/msg")
    public ResponseEntity<MainResponseEntity> msg(@RequestParam(value="param") String param) {
        log.info("param : " + param);
        MainResponseEntity entity = new MainResponseEntity();
        entity.setMsg("Docker Test(version "+ testVersion +") / your param:'" + param + "'");
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }
}