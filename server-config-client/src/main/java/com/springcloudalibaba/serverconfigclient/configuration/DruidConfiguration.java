package com.springcloudalibaba.serverconfigclient.configuration;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfiguration {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName ;

    @Bean
    public DataSource dataSource () {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        return dataSource ;
    }
}
