package cn.kgc.service;

import cn.kgc.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    //添加数据
    public void save(Admin admin);
    //通过用户名查询
    public Admin login(String AdminUser,String AdminPassword);
}
