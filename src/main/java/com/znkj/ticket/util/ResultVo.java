package com.znkj.ticket.util;

import com.google.gson.Gson;
import com.znkj.ticket.enums.ResultEnum;

import java.util.List;

/**
 * Ajax 请求返回统一 VO
 * @author yangjian
 * @since 2017/7/25.
 */
public class ResultVo<T> {

    /**
     * 错误代码,成功返回 000, 否则返回其他
     */
    private String code;

    /**
     * 返回提示信息
     */
    private String message;

    /**
     * 数据列表
     */
    private List<T> items;

    /**
     * 单条数据
     */
    private T item;

    /**
     * 总记录数
     */
    private Integer count=0;

    /**
     * 页码
     */
    private Integer page;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    public ResultVo() {
    }

    /**
     * 推荐使用这个构造方法,方便统一修改
     * @param resultEnum
     */
    public ResultVo(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public ResultVo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultVo(String code, String message, List<T> items) {
        this.code = code;
        this.message = message;
        this.items = items;
    }

    public ResultVo(String code, String message, T item) {
        this.code = code;
        this.message = message;
        this.item = item;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 返回一个成功的 VO
     * @return
     */
    public static ResultVo success() {
        return new ResultVo(ResultEnum.SUCCESS);
    }

    /**
     * 返回一个失败的 VO
     * @return
     */
    public static ResultVo fail() {
        return new ResultVo(ResultEnum.FAIL);
    }

    /**
     *  输出 json 字符串
     * @return
     */
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
