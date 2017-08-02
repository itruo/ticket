package com.znkj.ticket.mapper;

import com.znkj.ticket.model.AdminRole;
import com.znkj.ticket.util.MyMapper;

public interface AdminRoleMapper extends MyMapper<AdminRole> {
    public Integer selectRoleId(String name);
    public Integer updateRoleById(AdminRole adminRole);
}