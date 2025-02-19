package org.zerock.dao;

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
}
