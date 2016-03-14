package com.dong.web.utils;

/**
 * 数据库语句
 * Created by chuandong on 16/1/21.
 */
public class DBStatement {

    /**
     * 实现通过作者搜索该作者所有的作品
     */
    public static String getPoetriesByPoet = "SELECT poetries.title " +
            "FROM poetries " +
            "LEFT JOIN poets " +
            "ON poetries.poet_id = poets.id " +
            "WHERE poets.name = ?";

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
