package com.znkj.ticket.common;

/**
 * 返回结果定义
 * Created by pengkai
 * @date 2016/10/13 0009.
 * @email pengxiankaikai@163.com
 */
public interface RetResult {

    String SUCCESS = "SUCCESS";
    String FAIL = "FAIL";

    String MSG_SUCCESS = "操作成功";
    String MSG_FAIL = "操作失败";
    String MSG_PARAM_ERROR = "参数错误";
    String MSG_NOT_FOUND_RECORD = "该记录不存在";
    String MSG_NOT_LOGIN = "MSG_NOT_LOGIN";
}
