package cn.kgc;

import cn.kgc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
//查询所有
    @RequestMapping("/findAll")
    public List<Customer>findAll(){
        List<Customer> list = customerService.findAll();
        return list;
    }
    //根据车型和车牌号查找
    @RequestMapping("/findBy")
    public List<Customer>findBy(String carNum, String carType){
        List<Customer> customerList = customerService.findBy(carNum, carType);
        return customerList;
    }
    //根据车牌号查询
    @RequestMapping("/findByCarNum")
    public List<Customer>findByCarNum(String carNum){
        List<Customer> list = customerService.findByCarNum(carNum);
        return list;
    }
    //根据id删除
    @RequestMapping("/del")
    public String del(Integer id){
        customerService.delById(id);
        return"0";
    }

}
