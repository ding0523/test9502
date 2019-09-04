package cn.kgc.service;

import cn.kgc.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    //查询所有的信息
    public List<Customer> findAll();
    //根据车牌号和车辆类型查询
    public List<Customer>findBy(String carNum,String carType);
    //根据车牌号查询
    @Select("select * from customer where carNum=#{carNum}")
    public List<Customer>findByCarNum(String carNum);
    //根据Id删除
    public void delById(Integer id);
}
