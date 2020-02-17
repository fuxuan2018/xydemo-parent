package com.web.config;


import com.xydemo.utils.config.WebMvcConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 其他配置
 */
@MapperScan(basePackages = "com.web.mapper")
@ComponentScan("com.web.dao")
@Configuration
public class WebConfig extends WebMvcConfig {


}