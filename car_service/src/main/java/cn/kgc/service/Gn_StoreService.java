package cn.kgc.service;

import cn.kgc.Gn_Store;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Gn_StoreService {
    //查找所有门店
    public List<Gn_Store> findAll();
    //根据id查询门店
    public Gn_Store findById(Integer id);
    //根据storeAddress进行模糊查询
    public List<Gn_Store>findBystoreAddress(String storeAddress);
    //根据area查询
    public List<Gn_Store>findByArea(String area);
}
