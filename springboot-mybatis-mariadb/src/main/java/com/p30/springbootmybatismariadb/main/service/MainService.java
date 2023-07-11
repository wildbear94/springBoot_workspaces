package com.p30.springbootmybatismariadb.main.service;

import com.p30.springbootmybatismariadb.mapper.MainMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainMapper mainMapper;

  public String selectNow() throws Exception {
    String result = mainMapper.selectNow();
    return result;
  }

}
