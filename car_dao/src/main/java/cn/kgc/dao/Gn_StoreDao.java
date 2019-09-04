package cn.kgc.dao;

import cn.kgc.Gn_CarType;
import cn.kgc.Gn_Store;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Gn_StoreDao {
    //查找所有门店
    @Select("select * from carstore")
    public List<Gn_Store>findAll();
    //根据id查询门店
    @Select("select * from carstore where id=#{id}")
    public Gn_Store findById(Integer id);
    //根据storeAddress进行模糊查询
    @Select("select * from carstore where storeAddress like concat('%',#{storeAddress},'%')")
    public List<Gn_Store>findBystoreAddress(String storeAddress);
    //根据area查询门店
    @Select("Select * from carstore where area=#{area}")
    public List<Gn_Store>findByArea(String area);
}
