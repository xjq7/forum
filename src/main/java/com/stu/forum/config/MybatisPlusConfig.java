package com.stu.forum.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.stu.forum.mapper")
public class MybatisPlusConfig {

}
