package org.example.lazy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shiKui
 */
@Data
@AllArgsConstructor
public class User {
    public User(){
        System.out.println("user初始化");
    }
    private String username;
}
