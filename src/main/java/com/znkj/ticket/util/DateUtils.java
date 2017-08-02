package com.znkj.ticket.util;

import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yangjian
 * @since 2017-07-24
 */
public class DateUtils {

    //返回字符串
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return time.format(date);
    }
    //返回MySql时间类型
    public static Timestamp getCurrentTime2() {
        Date date = new Date();//获得系统时间.
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        Timestamp currentTime =Timestamp.valueOf(nowTime);//将时间格式转换成符合Timestamp要求的格式
        return currentTime;
    }
}
