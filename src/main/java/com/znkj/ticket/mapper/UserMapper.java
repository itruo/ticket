package com.znkj.ticket.mapper;

import com.znkj.ticket.model.User;
import com.znkj.ticket.util.MyMapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {
    public List<User> getFirmInfo();
}