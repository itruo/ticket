package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hall_seats")
public class HallSeats extends BaseEntity<String> {

    /**
     * 厅名称
     */
    private String name;

    /**
     * 厅类型，B:大，M:中，S:小（使用枚举类）
     */
    private String type;

    /**
     * 大厅座位楼层数
     */
    @Column(name = "layer_num")
    private Integer layerNum;

    /**
     * 大厅总座位数
     */
    @Column(name = "seats_num")
    private Integer seatsNum;

    /**
     * 是否可用，1：可用，0：冻结
     */
    private Integer enable;

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
     * 排位信息映射，json字符串存储
     */
    @Column(name = "seats_map")
    private String seatsMap;

    /**
     * 获取厅名称
     *
     * @return name - 厅名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置厅名称
     *
     * @param name 厅名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取厅类型，B:大，M:中，S:小（使用枚举类）
     *
     * @return type - 厅类型，B:大，M:中，S:小（使用枚举类）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置厅类型，B:大，M:中，S:小（使用枚举类）
     *
     * @param type 厅类型，B:大，M:中，S:小（使用枚举类）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取大厅座位楼层数
     *
     * @return layer_num - 大厅座位楼层数
     */
    public Integer getLayerNum() {
        return layerNum;
    }

    /**
     * 设置大厅座位楼层数
     *
     * @param layerNum 大厅座位楼层数
     */
    public void setLayerNum(Integer layerNum) {
        this.layerNum = layerNum;
    }

    /**
     * 获取大厅总座位数
     *
     * @return seats_num - 大厅总座位数
     */
    public Integer getSeatsNum() {
        return seatsNum;
    }

    /**
     * 设置大厅总座位数
     *
     * @param seatsNum 大厅总座位数
     */
    public void setSeatsNum(Integer seatsNum) {
        this.seatsNum = seatsNum;
    }

    /**
     * 获取是否可用，1：可用，0：冻结
     *
     * @return enable - 是否可用，1：可用，0：冻结
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 设置是否可用，1：可用，0：冻结
     *
     * @param enable 是否可用，1：可用，0：冻结
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
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

    /**
     * 获取排位信息映射，json字符串存储
     *
     * @return seats_map - 排位信息映射，json字符串存储
     */
    public String getSeatsMap() {
        return seatsMap;
    }

    /**
     * 设置排位信息映射，json字符串存储
     *
     * @param seatsMap 排位信息映射，json字符串存储
     */
    public void setSeatsMap(String seatsMap) {
        this.seatsMap = seatsMap;
    }
}