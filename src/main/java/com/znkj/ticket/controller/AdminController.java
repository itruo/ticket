package com.znkj.ticket.controller;

import com.znkj.ticket.model.Admin;
import com.znkj.ticket.model.AdminOpt;
import com.znkj.ticket.model.AdminRole;
import com.znkj.ticket.service.AdminService;
import com.znkj.ticket.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/7/27 9:10
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
/**
 * 登录
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 11:19
 */
    //登录页面
    @GetMapping(value = "/login")
    public String adminLogin(){
        return "admin-login";
    }

    @PostMapping(value = "/loginaction")
    public String doLogin(HttpServletRequest request, Model model){
        Admin admin = new Admin();
        admin.setUsername(request.getParameter("phone"));
        admin.setPassword(request.getParameter("password"));

        String sign = adminService.checkLogin(admin);
        if (sign.equals("success")){
            String role = adminService.getAdminRole(request.getParameter("phone"));
            HttpSession session = request.getSession();
            session.setAttribute("username", admin.getUsername());//把值存入session
            session.setAttribute("role",role);

            return "redirect:/admin/index";//重定向
        }else{
            model.addAttribute("msg", sign);
            return "admin-login";
        }
    }
/**
 * 管理员管理
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 11:20
 */
    //首页
    @GetMapping(value = "/index")
    public String adminIndex(){
        return "admin-index";
    }
    //管理员管理
    @GetMapping(value = "/adminmanger")
    public String adminManger(Model model){
        List admins = adminService.getAllItems();
        List roles = adminService.getAllRole();
        model.addAttribute("admins",admins);
        model.addAttribute("roles",roles);
        return "admin-manger";
    }
    //注销
    @GetMapping(value = "/exit")
    public String adminExit(HttpServletRequest request) {
        HttpSession session = request.getSession(false);//防止创建Session
        //session.removeAttribute("username");
        session.invalidate(); //删除所有session中保存的键
        return "admin-login";
    }
    //删除管理员
    @PostMapping(value = "/deladmin")
    @ResponseBody
    public Map delAdmin(HttpServletRequest request){
        Map map = new HashMap();
        int id = Integer.valueOf(request.getParameter("del_id"));
        String msg = adminService.delAdminById(id);
        map.put("msg",msg);
        return map;
    }
    //修改管理信息
    @PostMapping(value = "/updateadmin")
    @ResponseBody
    public Map updateAmin(HttpServletRequest request){
        Map map = new HashMap();
        Admin admin = new Admin();

        admin.setId(Integer.parseInt(request.getParameter("up_id")));
        admin.setPassword(request.getParameter("up_pwd"));
        admin.setEnable(Integer.parseInt(request.getParameter("up_able")));
        String msg = adminService.updateAdminById(admin);
        map.put("msg",msg);
        return map;
    }

    //修改管理权限
    @PostMapping(value = "/upadteadminopt")
    @ResponseBody
    public Map updateAdminOpt(HttpServletRequest request){
        Map map = new HashMap();
        Admin admin = new Admin();
        admin.setId(Integer.parseInt(request.getParameter("up_id")));
        admin.setRole(request.getParameter("up_role"));

        String msg = adminService.updateAdminById(admin);
        map.put("msg",msg);
        return map;
    }

    //添加管理员
    @PostMapping(value = "/addadmin")
    @ResponseBody
    public Map addAdmin(HttpServletRequest request){
        Map map = new HashMap();
        HttpSession session = request.getSession();
        String adderName = session.getAttribute("username").toString();
        Admin admin = new Admin();
        admin.setUsername(request.getParameter("add_name"));
        admin.setPassword(request.getParameter("add_pwd"));
        admin.setEnable(Integer.parseInt(request.getParameter("add_able")));

        String msg = adminService.addNewAdmin(admin,adderName);
        map.put("msg",msg);
        return map;
    }
/**
 * 操作权限
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 11:33
 */
    //操作权限管理页面
    @GetMapping(value = "/opt")
    public String optIndex(Model model){
        List opts = adminService.getAllOpt();
        model.addAttribute("opts",opts);
        return "admin-opt";
    }
    //删除操作权限
    @PostMapping(value = "delopt")
    @ResponseBody
    public Map delOpt(HttpServletRequest request){
        Map map = new HashMap();
        Integer id = Integer.parseInt(request.getParameter("del_id"));
        String msg = adminService.delOptById(id);
        map.put("msg",msg);
        return map;
    }
    //添加操作权限
    @PostMapping(value = "/addopt")
    @ResponseBody
    public Map addOpt(HttpServletRequest request){
        Map map = new HashMap();
        AdminOpt adminOpt = new AdminOpt();
        adminOpt.setName(request.getParameter("add_name"));
        HttpSession session = request.getSession();
        String adderName = session.getAttribute("username").toString();
        String msg = adminService.addOpt(adminOpt,adderName);
        map.put("msg",msg);
        return map;
    }
/**
 * 管理角色
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 11:33
 */
    //管理角色页面
    @GetMapping(value = "/role")
    public String roleIndex(Model model){
        List roles = adminService.getAllRole();
        List opts = adminService.getAllOpt();
        model.addAttribute("roles",roles);
        model.addAttribute("opts",opts);
        return "admin-role";
    }
    //添加管理角色
    @PostMapping(value = "/addrole")
    @ResponseBody
    public Map addRole(HttpServletRequest request){
        Map map = new HashMap();
        AdminRole adminRole =new AdminRole();
        adminRole.setName(request.getParameter("add_role_name"));
        adminRole.setPermissions(request.getParameter("add_role_opts"));

        HttpSession session = request.getSession();
        String adderName = session.getAttribute("username").toString();
        String msg = adminService.addRole(adminRole,adderName);
        map.put("msg",msg);
        return map;
    }

    //删除管理角色
    @PostMapping(value = "delrole")
    @ResponseBody
    public Map delRole(HttpServletRequest request){
        Map map = new HashMap();
        Integer delId = Integer.parseInt(request.getParameter("del_id"));
        String msg = adminService.delRoleById(delId);
        map.put("msg",msg);
        return map;
    }
    //修改管理角色权限
    @PostMapping(value = "updaterole")
    @ResponseBody
    public Map updateRole(HttpServletRequest request){
        Map map = new HashMap();
        AdminRole adminRole = new AdminRole();
        adminRole.setPermissions(request.getParameter("up_opt"));
        adminRole.setId(Integer.parseInt(request.getParameter("up_id")));
        String msg = adminService.updateRoleById(adminRole);
        map.put("msg",msg);
        return map;
    }

/**
 * 管理员资料
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 12:07
 */
    @GetMapping(value = "/information")
    public String adminInfo(){
        return "admin-info";
    }

}
