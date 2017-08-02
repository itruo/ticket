/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.znkj.ticket.controller;

import com.github.pagehelper.PageInfo;
import com.znkj.ticket.model.Admin;
import com.znkj.ticket.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@Controller
//@RequestMapping("/admin")
public class IndexController {

    /*@Autowired
    private AdminService adminService;

    @GetMapping("/index")
    @ResponseBody
    public PageInfo<Admin> getAll(Admin admin) {
        admin.setPage(1);
        List<Admin> list = adminService.getItemByPage(admin);
        return new PageInfo<>(list);
    }

    @GetMapping(value = "/add")
    @ResponseBody
    public String add(Admin admin) {
        adminService.add(admin);
        return "添加数据成功.";
    }

    @GetMapping("/hello")
    public String hello(ModelMap modelMap) {

        modelMap.put("title", "Hello, Spring Boot");
        return "index";
    }*/


}
