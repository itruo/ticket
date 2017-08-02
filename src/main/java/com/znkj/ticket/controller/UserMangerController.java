package com.znkj.ticket.controller;

import com.znkj.ticket.service.UserMangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/7/31 10:00
 */
@Controller
@RequestMapping(value = "/usermanger")
public class UserMangerController {
    @Autowired
    private UserMangerService userMangerService;

    /**
     * 用户信息管理
     * @Author LuoWenLiang <614169161@qq.com>
     * @Data 2017/8/2 11:52
     */
    //用户基本信息管理页面
    @GetMapping(value = "/userinfo")
    public String userManger(Model model){
        List users = userMangerService.getAllItems();
        model.addAttribute("users",users);
        return "user-manger";
    }

    /**
     * 公司信息管理
     * @Author LuoWenLiang <614169161@qq.com>
     * @Data 2017/8/2 11:52
     */
    //页面
    @GetMapping(value = "/firminfo")
    public String firmInfo(Model model){
        List userFirm = userMangerService.getFirms();
        model.addAttribute("users",userFirm);
        return "firm-manger";
    }

}
