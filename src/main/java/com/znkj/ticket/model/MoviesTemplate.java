package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "movies_template")
public class MoviesTemplate extends BaseEntity<String> {

    /**
     * 剧名
     */
    private String name;

    /**
     * 类型ID
     */
    private Integer type;

    /**
     * 演出人员
     */
    private String performers;

    /**
     * 演出时长（单位分钟），默认120分钟
     */
    private Integer duration;

    /**
     * 演出介绍
     */
    private String summary;

    /**
     * 封面
     */
    private String cover;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 是否删除
     */
    private Integer del;

    /**
     * 添加人
     */
    private Integer adder;


    /**
     * 获取剧名
     *
     * @return name - 剧名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置剧名
     *
     * @param name 剧名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型ID
     *
     * @return type - 类型ID
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型ID
     *
     * @param type 类型ID
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取演出人员
     *
     * @return performers - 演出人员
     */
    public String getPerformers() {
        return performers;
    }

    /**
     * 设置演出人员
     *
     * @param performers 演出人员
     */
    public void setPerformers(String performers) {
        this.performers = performers;
    }

    /**
     * 获取演出时长（单位分钟），默认120分钟
     *
     * @return duration - 演出时长（单位分钟），默认120分钟
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置演出时长（单位分钟），默认120分钟
     *
     * @param duration 演出时长（单位分钟），默认120分钟
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取演出介绍
     *
     * @return summary - 演出介绍
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置演出介绍
     *
     * @param summary 演出介绍
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取封面
     *
     * @return cover - 封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面
     *
     * @param cover 封面
     */
    public void setCover(String cover) {
        this.cover = cover;
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
     * 获取是否删除
     *
     * @return del - 是否删除
     */
    public Integer getDel() {
        return del;
    }

    /**
     * 设置是否删除
     *
     * @param del 是否删除
     */
    public void setDel(Integer del) {
        this.del = del;
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