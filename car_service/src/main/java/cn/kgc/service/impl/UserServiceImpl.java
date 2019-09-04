package cn.kgc.service.impl;

import cn.kgc.User;
import cn.kgc.dao.UserDao;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

//    @Override
//    public User login(String username, String password) {
//        return userDao.login(username,password);
//    }


    @Override
    public List<User> login(String username,String password) {
        return userDao.login(username,password);
    }
}
