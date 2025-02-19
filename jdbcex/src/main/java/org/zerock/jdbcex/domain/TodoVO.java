package org.zerock.jdbcex.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 1. ClassName     : TodoVO
 * 2. FileName      : TodoVO.java
 * 3. Package       : org.zerock.jdbcex.domain
 * 4. Author        : 윤명석
 * 5. Creation Date : 25. 2. 19. 오후 5:02
 * 6. Comment       :
 */

@Getter
@Builder
@ToString
public class TodoVO {
    
    private Long tno;
    
    private String title;
    
    private LocalDateTime dueDate;
    
    private boolean finished;
}
