package org.zerock.jdbcex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 1. ClassName     : TodoDAO
 * 2. FileName      : TodoDAO.java
 * 3. Package       : org.zerock.jdbcex.dao
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 19. 오후 5:31
 * 6. Comment       :
 */
public class TodoDAO {
    
    public String getTime() {
        
        String now = null;
        
        try (Connection connection = ConnectionUtil.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select now()");
             ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            resultSet.next();
            
            now = resultSet.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return now;
    }
}
