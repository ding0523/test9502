package cn.kgc.service.impl;

import cn.kgc.Gn_Store;
import cn.kgc.dao.Gn_StoreDao;
import cn.kgc.service.Gn_StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Gn_StoreServiceImpl implements Gn_StoreService {

    @Autowired
    Gn_StoreDao gn_storeDao;
    //查询所有门店
    @Override
    public List<Gn_Store> findAll() {
        return gn_storeDao.findAll();
    }
    //根据id查询门店
    @Override
    public Gn_Store findById(Integer id) {
        return gn_storeDao.findById(id);
    }

    @Override
    public List<Gn_Store> findBystoreAddress(String storeAddress) {
        return gn_storeDao.findBystoreAddress(storeAddress);
    }


    @Override
    public List<Gn_Store> findByArea(String area) {
        return gn_storeDao.findByArea(area);
    }
}
