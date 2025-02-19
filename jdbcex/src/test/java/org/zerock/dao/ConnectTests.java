package org.zerock.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 1. ClassName     : ConnectTests
 * 2. FileName      : ConnectTests.java
 * 3. Package       : org.zerock.dao
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 19. 오전 9:20
 * 6. Comment       :
 */
public class ConnectTests {
    
    @Test
    public void testConnection() throws Exception {
        
        Class.forName("org.mariadb.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/webdb",
            "webuser",
            "webuser"
        );
        
        Assertions.assertNotNull(connection);
        
        connection.close();
    }
    
    @Test
    public void testHikariCP() throws Exception {
        
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        
        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();
        
        System.out.println(connection);
        
        connection.close();
    }
}
