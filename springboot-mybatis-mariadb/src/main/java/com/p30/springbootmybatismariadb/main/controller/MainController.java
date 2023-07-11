package com.p30.springbootmybatismariadb.main.controller;

import com.p30.springbootmybatismariadb.main.service.MainService;
import org.apache.catalina.Container;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainService mainService;

  @GetMapping(value = "/test")
  private String Main() throws Exception {
    String result = mainService.selectNow();
    return result;
  }
}
