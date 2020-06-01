package com.duck.sqlsession;

import com.duck.pojo.Configuration;

public class DefaultSqlSessionFactory implements SqlsessionFactory{
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }

}
