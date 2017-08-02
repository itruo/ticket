package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

public class Theatre extends BaseEntity<String> {

    /**
     * 剧场名称
     */
    private String name;


    /**
     * 剧场联系电话
     */
    private String phone;

    /**
     * 省份
     */
    private Integer province;

    /**
     * 城市
     */
    private Integer city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 剧场介绍
     */
    private String company;

    /**
     * 是否审核
     */
    private Integer ischeked;

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
     * 场馆图片，多张图片使用json存储
     */
    private String pic;

    /**
     * 获取剧场名称
     *
     * @return name - 剧场名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置剧场名称
     *
     * @param name 剧场名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取剧场联系电话
     *
     * @return phone - 剧场联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置剧场联系电话
     *
     * @param phone 剧场联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public Integer getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取剧场介绍
     *
     * @return company - 剧场介绍
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置剧场介绍
     *
     * @param company 剧场介绍
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取是否审核
     *
     * @return ischeked - 是否审核
     */
    public Integer getIscheked() {
        return ischeked;
    }

    /**
     * 设置是否审核
     *
     * @param ischeked 是否审核
     */
    public void setIscheked(Integer ischeked) {
        this.ischeked = ischeked;
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
     * 获取场馆图片，多张图片使用json存储
     *
     * @return pic - 场馆图片，多张图片使用json存储
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置场馆图片，多张图片使用json存储
     *
     * @param pic 场馆图片，多张图片使用json存储
     */
    public void setPic(String pic) {
        this.pic = pic;
    }
}