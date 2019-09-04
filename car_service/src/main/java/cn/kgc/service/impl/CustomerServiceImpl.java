package cn.kgc.service.impl;

import cn.kgc.Customer;
import cn.kgc.dao.CustomerDao;
import cn.kgc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;
    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public List<Customer> findBy(String carNum, String carType) {
        return customerDao.findBy(carNum,carType);
    }

    @Override
    public List<Customer> findByCarNum(String carNum) {
        return customerDao.findByCarNum(carNum);
    }

    @Override
    public void delById(Integer id) {
        customerDao.delById(id);
    }
}
