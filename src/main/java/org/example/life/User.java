package org.example.life;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shiKui
 */
@AllArgsConstructor
@Data
public class User {
    private String username;

    public User(){
        System.out.println(this.username + "调用构造器进行初始化");
    }

    public void init(){
        System.out.println(this.username + "初始化方法");
    }

    public void destroy(){
        System.out.println(this.username + "销毁方法");
    }
}
