package cn.kgc.service;

import cn.kgc.Gn_Store;
import cn.kgc.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //添加数据
    public void save(User user);
    //按照用户名查询
    public User findByUsername(String username);
    //登录查询
//    public List<User> login(String username,String password);
    public List<User> login(String username,String password);

}
