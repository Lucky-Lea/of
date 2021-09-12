package com.lea.entity;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能说明：mybatis-plus注册配置
 * 开发人员：@author liusha
 * 开发日期：2019/9/1 9:28
 * 功能描述：分页插件
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.lea.dao")public class MybatisPlusConfig{
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}