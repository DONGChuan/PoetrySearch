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
     * 实现诗词名称搜索唐诗全文并显示
     */
    public static String getPoetriesByTitle = "SELECT poets.id, poets.name, p.content " +
            "FROM poetries p " +
            "LEFT JOIN poets " +
            "ON p.poet_id = poets.id " +
            "WHERE p.title = ?";

    /**
     * 实现通过诗歌的名句搜索该唐诗的作者、题目和全文
     */
    public static String getPoetriesByContent = "SELECT poets.id, p.title, p.content, poets.name " +
            "FROM poetries p " +
            "LEFT JOIN poets " +
            "ON p.poet_id = poets.id " +
            "WHERE p.content LIKE ?";

    /**
     * 实现诗词名称和作者搜索唐诗全文并显示
     */
    public static String getPoetriesByTitleAndPoet = "SELECT poets.id, p.content " +
            "FROM poetries p " +
            "LEFT JOIN poets " +
            "ON p.poet_id = poets.id " +
            "WHERE p.title = ? AND poets.name = ?";


}
