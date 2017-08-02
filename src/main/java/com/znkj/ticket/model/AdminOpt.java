package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "admin_opt")
public class AdminOpt extends BaseEntity<Integer> {

    /**
     * 操作名称
     */
    private String name;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 添加人
     */
    private Integer adder;

    /**
     * 获取操作名称
     *
     * @return name - 操作名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置操作名称
     *
     * @param name 操作名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取添加时间
     *
     * @return addtime - 添加时间
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * 设置添加时间
     *
     * @param addtime 添加时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取更新时间
     *
     * @return updatetime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取添加人
     *
     * @return adder - 添加人
     */
    public Integer getAdder() {
        return adder;
    }

    /**
     * 设置添加人
     *
     * @param adder 添加人
     */
    public void setAdder(Integer adder) {
        this.adder = adder;
    }
}