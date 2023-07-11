package com.p30.springbootmybatismariadb.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {

  public String selectNow() throws Exception;

}
