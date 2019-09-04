package cn.kgc.dao;

import cn.kgc.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
    //查询所有的信息
    @Select("select * from customer")
    public List<Customer>findAll();
    //根据车牌号和车辆类型查询
    @Select("select * from customer where carNum=#{arg0} and carType=#{arg1} ")
    public List<Customer>findBy(String carNum,String carType);
    //根据车牌号查询
    @Select("select * from customer where carNum=#{carNum}")
    public List<Customer>findByCarNum(String carNum);

    //根据Id删除
    @Select("delete from customer where id=#{id}")
    public void delById(Integer id);

}
