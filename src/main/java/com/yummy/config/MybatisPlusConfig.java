package com.yummy.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public PerformanceMonitorInterceptor performanceMonitorInterceptor(){
        return new PerformanceMonitorInterceptor();
    }

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        return new PaginationInnerInterceptor();
    }
}
