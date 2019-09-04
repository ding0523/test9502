package cn.kgc.service.impl;

import cn.kgc.Member;
import cn.kgc.dao.MemberDao;
import cn.kgc.service.MemberService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao memberDao;
    @Override
    public List<Member> findAll() {
        return memberDao.findAll();
    }

    @Override
    public List<Member> findByPhone(String phone) {
        return memberDao.findByPhone(phone);
    }

    @Override
    public PageInfo<Member> findByPageHelper(Integer currentPage, Integer pageSized) {
        //指定分页参数
        PageHelper.startPage(currentPage,pageSized);
        //查询全部
        List<Member> memberlist = memberDao.findAll();
        //创建PageInfor对象
        PageInfo<Member> pageInfor = new PageInfo<>(memberlist,5);
        System.out.println(memberlist.toString());
        return pageInfor;
    }
}
