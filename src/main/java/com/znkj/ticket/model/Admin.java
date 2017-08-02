package com.znkj.ticket.model;

import java.util.Date;
import javax.persistence.*;

public class Admin extends BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名，使用电话号码注册
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 角色
     */
    private String role;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 是否可用，1：可用，0：冻结
     */
    private Integer enable = 1;

    /**
     * 添加人
     */
    private Integer adder;

    /**
     * 获取用户名，使用电话号码注册
     *
     * @return username - 用户名，使用电话号码注册
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名，使用电话号码注册
     *
     * @param username 用户名，使用电话号码注册
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
     * 获取角色
     *
     * @return  role
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置角色
     *
     * @param role 角色
     */
    public void setRole(String role) {
        this.role = role;
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

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + super.getId() +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", addtime=" + addtime +
                ", updatetime=" + updatetime +
                ", enable=" + enable +
                ", adder=" + adder +
                '}';
    }
}