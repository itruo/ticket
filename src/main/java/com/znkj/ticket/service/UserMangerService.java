package com.znkj.ticket.service;

import com.znkj.ticket.mapper.UserMapper;
import com.znkj.ticket.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LuoWenLiang <614169161qq.com>
 * @Data 2017/8/1 ${time}
 */
@Service
public class UserMangerService extends BaseService<UserMapper,User> {
    @Autowired
    private UserMapper userMapper;

    public List<User> getFirms() {
        return userMapper.getFirmInfo();
    }
}
