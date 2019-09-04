package cn.kgc.service.impl;

import cn.kgc.Admin;
import cn.kgc.dao.AdminDao;
import cn.kgc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    //添加数据
    @Autowired
    AdminDao adminDao;
    @Override
    public void save(Admin admin) {
        adminDao.save(admin);
    }
    //登录查询
    @Override
    public Admin login(String AdminUser, String AdminPassword) {
        return adminDao.login(AdminUser,AdminPassword);
    }





}
