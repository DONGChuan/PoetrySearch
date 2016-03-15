package com.dong.web.utils;

/**
 * SQL statement
 * Created by DONGChuan on 16/1/21.
 */
public class DBStatement {

    /**
     * Get all poetries by poet name
     */
    public static String getPoetriesByPoetName = "SELECT e " +
            "FROM Poetry e " +
            "LEFT JOIN Poet p " +
            "ON e.poet.id = p.id " +
            "WHERE p.name = :name";

    /**
     * Get poetries by title
     */
    public static String getPoetriesByTitle = "SELECT e " +
            "FROM Poetry e " +
            "LEFT JOIN Poet p " +
            "ON e.poet.id = p.id " +
            "WHERE e.title = :title";

    /**
     * Get poetries by content
     */
    public static String getPoetriesByContent = "SELECT e " +
            "FROM Poetry e " +
            "LEFT JOIN Poet p " +
            "ON e.poet.id = p.id " +
            "WHERE e.content LIKE :content";

    /**
     * Get poetries by title and poet name
     */
    public static String getPoetriesByTitleAndPoetName = "SELECT e " +
            "FROM Poetry e " +
            "LEFT JOIN Poet p " +
            "ON e.poet.id = p.id " +
            "WHERE e.title = :title AND p.name = :name";


}
