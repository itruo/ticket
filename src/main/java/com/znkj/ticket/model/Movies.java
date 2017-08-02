package com.znkj.ticket.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Movies extends BaseEntity<String> {

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
     * 上映周期开始时间
     */
    private Date starttime;

    /**
     * 上映周期结束时间
     */
    private Date endtime;

    /**
     * 演播厅ID
     */
    @Column(name = "hall_id")
    private String hallId;

    /**
     * 最高票价
     */
    @Column(name = "max_price")
    private BigDecimal maxPrice;

    /**
     * 最低票价
     */
    @Column(name = "min_price")
    private BigDecimal minPrice;

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
     * 获取上映周期开始时间
     *
     * @return starttime - 上映周期开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置上映周期开始时间
     *
     * @param starttime 上映周期开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取上映周期结束时间
     *
     * @return endtime - 上映周期结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置上映周期结束时间
     *
     * @param endtime 上映周期结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
     * 获取最高票价
     *
     * @return max_price - 最高票价
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * 设置最高票价
     *
     * @param maxPrice 最高票价
     */
    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * 获取最低票价
     *
     * @return min_price - 最低票价
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * 设置最低票价
     *
     * @param minPrice 最低票价
     */
    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
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