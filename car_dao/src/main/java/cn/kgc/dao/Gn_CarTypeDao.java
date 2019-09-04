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
public interface Gn_CarTypeDao {
    //查询所有车型
    @Select("select * from gn_cartype")
    public List<Gn_CarType> findAll();

    //按照Id查找
    @Select("select * from gn_cartype where id=#{id}")
//    @Results({
//            @Result(property = "gn_store",column = "carStoreId",javaType = Gn_Store.class,
//            one = @One(select = "cn.kgc.dao.Gn_StoreDao.findById")
//            )
//    })
    public Gn_CarType findById(Integer id);

    //根据gn_sort查找
    @Select("select * from gn_cartype where gn_sort=#{gn_sort}")
    public List<Gn_CarType> findBysort(String gn_sort);

}
