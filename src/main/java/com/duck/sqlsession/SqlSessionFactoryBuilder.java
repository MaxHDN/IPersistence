package com.duck.sqlsession;

import com.duck.config.XMLConfigBuilder;
import com.duck.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    public SqlsessionFactory build(InputStream in) throws DocumentException, PropertyVetoException {
        //第一：使用dom4j解析配置文件，将解析出来的内容封装到Configuration
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parseConfig(in);

        //第二：创建sqlSessionFactory对象


        return null;
    }
}
