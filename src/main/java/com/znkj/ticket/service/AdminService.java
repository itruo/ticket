package com.znkj.ticket.service;

import com.znkj.ticket.mapper.AdminMapper;
import com.znkj.ticket.mapper.AdminOptMapper;
import com.znkj.ticket.mapper.AdminRoleMapper;
import com.znkj.ticket.model.Admin;
import com.znkj.ticket.model.AdminOpt;
import com.znkj.ticket.model.AdminRole;
import com.znkj.ticket.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.List;


/**
 * @author yangjian
 * @since 2017-07-25
 */
@Service
public class AdminService extends BaseService<AdminMapper, Admin> {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminOptMapper adminOptMapper;

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    DateUtils dateUtils = new DateUtils();

/**
 * 管理员登录操作
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/8/1 9:46
 */
    //登录
    public String checkLogin(Admin admin){
            //查找用户名,验证用户是否存在
            if(adminMapper.selectByUserName(admin.getUsername()) != null){
                //检查是否可用freeze
                Integer enable = adminMapper.selectAbleByUserName(admin.getUsername());
                if (enable == 1){
                //匹配密码
                String pwd = adminMapper.selectPassword(admin.getUsername());
                if (admin.getPassword().equals(pwd)){
                    return "success";
                }else{
                    return "errPwd";
                }
                }else{
                    return "freeze";
                }
            }else{
                return "errPhone";
            }
    }
    /**
     * 管理员管理操作
     * @Author LuoWenLiang <614169161@qq.com>
     * @Data 2017/7/31 17:41
     */
    //查询所有管理员
    @Override
    public List<Admin> getAllItems(){
        List admins = adminMapper.selectAll();
        return admins;
    }
    //获取管理员角色
    public String getAdminRole(String username){
        String role = adminMapper.selectRole(username);
        return role;
    }
    //根据id删除管理
    public String delAdminById(Integer id){
        int flag = adminMapper.deleteByPrimaryKey(id);
        if ((Object)flag != null){
            return "success";
        }else{
            return "fail";
        }
    }
    //根据id更新管理
    public String updateAdminById(Admin admin){

        Timestamp currentTime = dateUtils.getCurrentTime2();

        admin.setUpdatetime(currentTime);

        Integer result = adminMapper.updateById(admin);

        if ((Object)result != null){
            return "success";
        }else{
            return "fail";
        }

    }
    //添加管理员
    public String addNewAdmin(Admin admin, String adderName) {
        //先判断该手机号是否存在
        Integer exist = adminMapper.selectByUserName(admin.getUsername());
        if ((Object) exist != null) {
            return "exist";
        } else {
            //把添加者的id查询出来
            Integer adderId = adminMapper.selectByUserName(adderName);
            admin.setAdder(adderId);
            //获取时间
            Timestamp currentTime = dateUtils.getCurrentTime2();
            admin.setAddtime(currentTime);
            admin.setUpdatetime(currentTime);

            Integer result = adminMapper.insertAdmin(admin);
            if ((Object) result != null) {
                return "success";
            } else {
                return "fail";
            }
        }
    }

/**
 * 操作权限管理
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/7/31 17:41
 */
    //查询所有操作权限
    public List<AdminOpt> getAllOpt(){
        List opts = adminOptMapper.selectAll();
        return  opts;
    }
    //删除操作权限
    public String delOptById(Integer id){
        Integer flag = adminOptMapper.deleteByPrimaryKey(id);
        if ((Object)flag != null){
            return "success";
        }else{
            return "fail";
        }
    }
    //添加操作权限
    public String addOpt(AdminOpt adminOpt,String adderName){
        //检验操作是否存在
        Integer optId = adminOptMapper.selectOptId(adminOpt.getName());
        if((Object)optId != null){
            return "exist";
        }else{
            //获取添加者和时间
            Integer adderId = adminMapper.selectByUserName(adderName);
            adminOpt.setAdder(adderId);

            Timestamp currentTime = dateUtils.getCurrentTime2();
            adminOpt.setAddtime(currentTime);
            adminOpt.setUpdatetime(currentTime);

            //插入
            Integer flag = adminOptMapper.insert(adminOpt);
            if ((Object)flag != null){
                return "success";
            }else{
                return "fail";
            }
        }
    }

/**
 * 管理员角色管理
 * @Author LuoWenLiang <614169161@qq.com>
 * @Data 2017/7/31 17:42
 */
    //查询所有管理角色
    public List<AdminRole> getAllRole(){
        List roles = adminRoleMapper.selectAll();
        return  roles;
    }
    //添加管理角色
    public String addRole(AdminRole adminRole, String adderName){
        //检验角色是否存在
        Integer roleId = adminRoleMapper.selectRoleId(adminRole.getName());
        if((Object)roleId != null){
            return "exist";
        }else{
            //获取添加者和时间
            Integer adderId = adminMapper.selectByUserName(adderName);
            adminRole.setAdder(adderId);

            Timestamp currentTime = dateUtils.getCurrentTime2();
            adminRole.setAddtime(currentTime);
            adminRole.setUpdatetime(currentTime);

            //插入
            Integer flag = adminRoleMapper.insert(adminRole);
            if ((Object)flag != null){
                return "success";
            }else{
                return "fail";
            }
        }
    }
    //删除管理角色
    public String delRoleById(Integer delId){
        Integer delRoleFlag = adminRoleMapper.deleteByPrimaryKey(delId);
        if((Object)delRoleFlag != null){
            return "success";
        }else{
            return "fail";
        }
    }
    //更新角色操作权限
    public String updateRoleById(AdminRole adminRole){
        //Integer upRoleFlag = adminRoleMapper.updateByPrimaryKey(adminRole);//此方法更新不能有字段为空
        Timestamp nowTime = dateUtils.getCurrentTime2();
        adminRole.setUpdatetime(nowTime);

        Integer upRoleFlag = adminRoleMapper.updateRoleById(adminRole);
        if ((Object)upRoleFlag != null){
            return "success";
        }else{
            return "fail";
        }
    }
}
