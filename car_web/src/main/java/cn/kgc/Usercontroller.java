package cn.kgc;

import cn.kgc.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    UserService userService;
    //添加数据
    @RequestMapping("/save")
    public void save(User user){
        System.out.println(user);
        userService.save(user);
//        return "0";
    }
    @RequestMapping("/judge")
    public String judge(User user){
        System.out.println(user);
        User user1 = userService.findByUsername(user.getUsername());
        if(user1==null){
            save(user);
            return "0";
        }else {
            return "1";
        }
    }
    //登录查询
    @RequestMapping("/logins")
    public String findByUsername(User user){
        List<User> user1 = userService.login(user.getUsername(), user.getPassword());
        User user2 = userService.findByUsername(user.getUsername());
        if (user2==null){
//            save(user);
            return "2";
        }else{
            if(user1.size()==0){
                return "1";
            }else {
                return "0";
            }
        }


    }
    //按照用户名查找
    @RequestMapping("/findByUsername")
    public void findByUsername(String username,HttpServletResponse response) throws IOException {
        User user = userService.findByUsername(username);
        System.out.println(user);
        if (user==null){
        response.getWriter().write("false");
        }else{
            response.getWriter().write("true");
        }

    }
}
