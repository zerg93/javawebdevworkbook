package org.zerock.jdbcex.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

/**
 * 1. ClassName     : ConnectionUtil
 * 2. FileName      : ConnectionUtil.java
 * 3. Package       : org.zerock.jdbcex.dao
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 19. 오후 5:32
 * 6. Comment       :
 */
public enum ConnectionUtil {
    
    INSTANCE;
    
    private HikariDataSource ds;
    
    ConnectionUtil() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        
        ds = new HikariDataSource(config);
    }
    
    public Connection getConnection() throws Exception {
        return ds.getConnection();
    }
}
