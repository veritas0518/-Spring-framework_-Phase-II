package com.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SpringConfig
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2021/9/20 17:01
 **/

@Configuration //把当前类作为配置类，用来替代xml配置文件
@ComponentScan(basePackages = "com.spring5")
public class SpringConfig {
}
