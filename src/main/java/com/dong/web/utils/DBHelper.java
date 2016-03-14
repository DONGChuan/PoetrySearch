package com.dong.web.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by chuandong on 16/1/21.
 */
public class DBHelper {

    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    private static Connection connection;

    /**
     * 从 DBConfig.properties 读取数据库配置
     */
    static {
        Properties properties = new Properties();
        try {
            InputStream input = DBHelper.class.getClassLoader()
                    .getResourceAsStream("DBConfig.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

    /**
     * 返回数据库连接的实例
     * @return 数据库连接
     */
    public static Connection getInstance() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
