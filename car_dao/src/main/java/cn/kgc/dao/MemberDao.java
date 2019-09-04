package cn.kgc.dao;

import cn.kgc.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberDao {
    //查询所有会员信息
    @Select("select * from memeber")
    public List<Member>findAll();
    //根据手机号查询
    @Select("select * from memeber where phone=#{phone}")
    public List<Member>findByPhone(String phone);

    //多条件查询
    public List<Member>finds();

}
