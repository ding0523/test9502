package cn.kgc.dao;

import cn.kgc.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    //添加数据
    @Insert("insert into Admin values(null,#{AdminUser},#{AdminPassword})")
    public void save(Admin admin);
    //登录查询
    @Select("select * from Admin where AdminUser=#{arg0} and AdminPassword=#{arg1}")
    public Admin login(String AdminUser,String AdminPassword);
}
