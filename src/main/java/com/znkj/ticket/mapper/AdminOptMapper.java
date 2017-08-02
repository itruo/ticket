package com.znkj.ticket.mapper;

import com.znkj.ticket.model.AdminOpt;
import com.znkj.ticket.util.MyMapper;

public interface AdminOptMapper extends MyMapper<AdminOpt> {
    public Integer selectOptId(String name);
}