package cn.kgc.dao;

import cn.kgc.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //添加数据
    @Insert("insert into user values(null,#{username},#{password},#{phone},#{email})")
    public void save(User user);
    //查询所有
    @Select("select * from user")
    public List<User>findAll();
    //按照用户名查询
    @Select("select * from user where username=#{username}")
    public User findByUsername(String username);
    //登录查询账户
    @Select("select * from user where username=#{arg0} and password=#{arg1}")
    public List<User> login(String username,String password);
//    where username=#{arg0} and password=#{arg1}
}
