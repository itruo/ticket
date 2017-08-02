package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

/**
 * 电影场次表
 */

@Table(name = "movie_times")
public class MovieTimes extends BaseEntity<String> {

    /**
     * 影片ID
     */
    @Column(name = "movie_id")
    private String movieId;

    /**
     * 影片模板ID
     */
    @Column(name = "temp_id")
    private String tempId;

    /**
     * 剧场ID
     */
    @Column(name = "theatre_id")
    private String theatreId;

    /**
     * 演播厅ID
     */
    @Column(name = "hall_id")
    private String hallId;

    /**
     * 上映时间
     */
    private Date starttime;

    /**
     * 演出时长（单位分钟），默认120分钟
     */
    private Integer duration;

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
     * 获取影片ID
     *
     * @return movie_id - 影片ID
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * 设置影片ID
     *
     * @param movieId 影片ID
     */
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    /**
     * 获取影片模板ID
     *
     * @return temp_id - 影片模板ID
     */
    public String getTempId() {
        return tempId;
    }

    /**
     * 设置影片模板ID
     *
     * @param tempId 影片模板ID
     */
    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    /**
     * 获取剧场ID
     *
     * @return theatre_id - 剧场ID
     */
    public String getTheatreId() {
        return theatreId;
    }

    /**
     * 设置剧场ID
     *
     * @param theatreId 剧场ID
     */
    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    /**
     * 获取演播厅ID
     *
     * @return hall_id - 演播厅ID
     */
    public String getHallId() {
        return hallId;
    }

    /**
     * 设置演播厅ID
     *
     * @param hallId 演播厅ID
     */
    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    /**
     * 获取上映时间
     *
     * @return starttime - 上映时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置上映时间
     *
     * @param starttime 上映时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
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