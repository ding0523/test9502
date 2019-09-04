package cn.kgc.service.impl;

import cn.kgc.Gn_CarType;
import cn.kgc.dao.Gn_CarTypeDao;
import cn.kgc.service.Gn_CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Gn_CarTypeServiceImpl implements Gn_CarTypeService {
    @Autowired
    Gn_CarTypeDao gn_carTypeDao;
    //查询所有车型
    @Override
    public List<Gn_CarType> findAll() {
        return gn_carTypeDao.findAll();
    }
//按照id查询
    @Override
    public Gn_CarType findById(Integer id) {
        return gn_carTypeDao.findById(id);
    }

    @Override
    public List<Gn_CarType> findBysort(String gn_sort) {
        return gn_carTypeDao.findBysort(gn_sort);
    }
}
