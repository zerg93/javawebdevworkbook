package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;

/**
 * 1. ClassName     : TodoDAOTests
 * 2. FileName      : TodoDAOTests.java
 * 3. Package       : org.zerock.dao
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 19. 오후 5:40
 * 6. Comment       :
 */
public class TodoDAOTests {
    
    private TodoDAO todoDAO;
    
    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }
    
    @Test
    public void testTime() throws Exception{
        
        System.out.println(todoDAO.getTime());
    }
}
