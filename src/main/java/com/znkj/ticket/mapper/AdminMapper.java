package com.znkj.ticket.mapper;

import com.znkj.ticket.model.Admin;
import com.znkj.ticket.util.MyMapper;

import java.util.List;

public interface AdminMapper extends MyMapper<Admin>{

    public Integer selectByUserName(String username);
    public Integer selectAbleByUserName(String username);
    public String selectRole(String username);
    public String selectPassword(String username);
    public Integer updateById(Admin admin);
    public Integer insertAdmin(Admin admin);


}