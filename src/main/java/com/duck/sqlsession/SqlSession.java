package com.duck.sqlsession;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface SqlSession {

    //查询所有
    public <E> List<E> selectList(String statementId,Object... params) throws IllegalAccessException, IntrospectionException, InstantiationException, NoSuchFieldException, SQLException, InvocationTargetException, ClassNotFoundException;

    //根据条件查询单个
    public <T> T selectOne(String statementId,Object... params) throws IllegalAccessException, ClassNotFoundException, IntrospectionException, InstantiationException, SQLException, InvocationTargetException, NoSuchFieldException;
}