package com.znkj.ticket.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "movie_seats")
public class MovieSeats extends BaseEntity<String> {

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
     * 排号
     */
    private Integer rows;

    /**
     * 座号
     */
    private Integer cols;

    /**
     * 票价
     */
    private BigDecimal price;

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
     * 获取排号
     *
     * @return rows - 排号
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 设置排号
     *
     * @param rows 排号
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 获取座号
     *
     * @return cols - 座号
     */
    public Integer getCols() {
        return cols;
    }

    /**
     * 设置座号
     *
     * @param cols 座号
     */
    public void setCols(Integer cols) {
        this.cols = cols;
    }

    /**
     * 获取票价
     *
     * @return price - 票价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置票价
     *
     * @param price 票价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
}