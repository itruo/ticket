package com.znkj.ticket.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class User extends BaseEntity<String> {

    /**
     * 用户类别，B:B端用户，C:C端用户
     */
    private String type;

    /**
     * 用户名,使用手机号码注册
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别，男：M，女：F
     */
    private String sex;

    /**
     * 身份证号码
     */
    private String idnum;

    /**
     * 身份正面图片
     */
    @Column(name = "idpic_front")
    private String idpicFront;

    /**
     * 身份背面图片
     */
    @Column(name = "idpic_back")
    private String idpicBack;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 冻结金额
     */
    private BigDecimal frozen;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 公司法人
     */
    private String corporation;

    /**
     * 公司固定电话
     */
    private String phone;

    /**
     * 公司营业执照
     */
    @Column(name = "bus_lisence")
    private String busLisence;

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
     * 获取用户类别，B:B端用户，C:C端用户
     *
     * @return type - 用户类别，B:B端用户，C:C端用户
     */
    public String getType() {
        return type;
    }

    /**
     * 设置用户类别，B:B端用户，C:C端用户
     *
     * @param type 用户类别，B:B端用户，C:C端用户
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取用户名,使用手机号码注册
     *
     * @return username - 用户名,使用手机号码注册
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名,使用手机号码注册
     *
     * @param username 用户名,使用手机号码注册
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别，男：M，女：F
     *
     * @return sex - 性别，男：M，女：F
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别，男：M，女：F
     *
     * @param sex 性别，男：M，女：F
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取身份证号码
     *
     * @return idnum - 身份证号码
     */
    public String getIdnum() {
        return idnum;
    }

    /**
     * 设置身份证号码
     *
     * @param idnum 身份证号码
     */
    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    /**
     * 获取身份正面图片
     *
     * @return idpic_front - 身份正面图片
     */
    public String getIdpicFront() {
        return idpicFront;
    }

    /**
     * 设置身份正面图片
     *
     * @param idpicFront 身份正面图片
     */
    public void setIdpicFront(String idpicFront) {
        this.idpicFront = idpicFront;
    }

    /**
     * 获取身份背面图片
     *
     * @return idpic_back - 身份背面图片
     */
    public String getIdpicBack() {
        return idpicBack;
    }

    /**
     * 设置身份背面图片
     *
     * @param idpicBack 身份背面图片
     */
    public void setIdpicBack(String idpicBack) {
        this.idpicBack = idpicBack;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
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
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取冻结金额
     *
     * @return frozen - 冻结金额
     */
    public BigDecimal getFrozen() {
        return frozen;
    }

    /**
     * 设置冻结金额
     *
     * @param frozen 冻结金额
     */
    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }

    /**
     * 获取公司名称
     *
     * @return company - 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名称
     *
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取公司法人
     *
     * @return corporation - 公司法人
     */
    public String getCorporation() {
        return corporation;
    }

    /**
     * 设置公司法人
     *
     * @param corporation 公司法人
     */
    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    /**
     * 获取公司固定电话
     *
     * @return phone - 公司固定电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置公司固定电话
     *
     * @param phone 公司固定电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取公司营业执照
     *
     * @return bus_lisence - 公司营业执照
     */
    public String getBusLisence() {
        return busLisence;
    }

    /**
     * 设置公司营业执照
     *
     * @param busLisence 公司营业执照
     */
    public void setBusLisence(String busLisence) {
        this.busLisence = busLisence;
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
}