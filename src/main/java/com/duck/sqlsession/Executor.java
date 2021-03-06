package com.duck.sqlsession;

import com.duck.pojo.Configuration;
import com.duck.pojo.MappedStatement;

import java.util.List;

public interface Executor {
    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;
}
