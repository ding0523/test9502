package cn.kgc;

import cn.kgc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/Admin")
public class AdminController {
    //注册
    @Autowired
    AdminService adminService;
    @RequestMapping("/save")
    public String save(Admin admin){
        adminService.save(admin);
        return "0";
    }
//    //判断用户是否注册过
//    @RequestMapping("/judge")
//    public String judge(Admin admin){
//        Admin admin2 = adminService.findByAdminUser(admin.getAdminUser());
//        if (admin2!=null){
//            return "1";
//        }else {
//            save(admin);
//            return "0";
//        }
//    }
    //登录
    @RequestMapping("/login")
    public String login(Admin admin){
        Admin admin2 = adminService.login(admin.getAdminUser(), admin.getAdminPassword());
        if(admin2!=null){
            return "1";
        }else {
            return "0";
        }


    }
}
