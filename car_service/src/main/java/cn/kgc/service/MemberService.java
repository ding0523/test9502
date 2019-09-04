package cn.kgc.service;

import cn.kgc.Member;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    //查询所有会员信息
    public List<Member> findAll();
    //根据手机号查询
    public List<Member>findByPhone(String phone);
    //分页助手
    public PageInfo<Member> findByPageHelper(Integer currentPage, Integer pageSized);

}
