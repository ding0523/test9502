package cn.kgc.service;

import cn.kgc.Gn_CarType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Gn_CarTypeService {
    //查找所有车型
    public List<Gn_CarType> findAll();
    //按照Id查找
    public Gn_CarType findById(Integer id);
    //根据gn_sort查找
    public List<Gn_CarType> findBysort(String gn_sort);
}
