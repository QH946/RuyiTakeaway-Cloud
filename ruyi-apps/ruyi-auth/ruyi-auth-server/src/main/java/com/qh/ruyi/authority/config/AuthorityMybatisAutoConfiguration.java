package com.qh.ruyi.authority.config;

import com.qh.ruyi.database.datasource.BaseMybatisConfiguration;
import com.qh.ruyi.database.properties.DatabaseProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
/**
 * Mybatis相关配置
 */
@Configuration
@Slf4j
public class AuthorityMybatisAutoConfiguration extends BaseMybatisConfiguration {
    public AuthorityMybatisAutoConfiguration(DatabaseProperties databaseProperties) {
        super(databaseProperties);
    }
}