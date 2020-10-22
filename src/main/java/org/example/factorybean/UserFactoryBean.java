package org.example.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User("hello");
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
