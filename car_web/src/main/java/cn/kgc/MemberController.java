package cn.kgc;

import cn.kgc.service.MemberService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin
public class MemberController {
    @Autowired
    MemberService memberService;
    //分页助手
    @RequestMapping("/page")
    public PageInfo<Member> finds(
            @RequestParam(value = "currentPage",required = false,defaultValue = "1") Integer currentPage,
            @RequestParam(value ="pageSize",required = false, defaultValue = "5") Integer pageSize){
        //准备数据    分页数据
        PageInfo<Member> pageInfo = memberService.findByPageHelper(currentPage, pageSize);
        return pageInfo;
    }

    //查询所有会员信息
    @RequestMapping("/findAll")
    public List<Member>findAll(){
        List<Member> memberList = memberService.findAll();
        return memberList;
    }

    //根据phone查询
    @RequestMapping("/findByPhone")
    public List<Member>findByPhone(String phone){
        List<Member> phoneList = memberService.findByPhone(phone);
        return phoneList;
    }
}
