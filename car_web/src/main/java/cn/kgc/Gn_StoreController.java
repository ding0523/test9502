package cn.kgc;

import cn.kgc.service.Gn_StoreService;
import cn.kgc.service.impl.Gn_StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/gn_store")
public class Gn_StoreController {
    @Autowired
    Gn_StoreServiceImpl gn_storeService;
    @RequestMapping("/StoreShow")
    public List<Gn_Store> findAll(){
        List<Gn_Store> allStore = gn_storeService.findAll();
        return allStore;
    }
    //根据storeName进行模糊查询
    @RequestMapping("/findBystoreAddress")
    public List<Gn_Store> findBystoreAddress(String storeAddress){
        List<Gn_Store> storelists = gn_storeService.findBystoreAddress(storeAddress);
        return storelists;

    }
    //根据area进行模糊查询
    @RequestMapping("/findByArea")
    public List<Gn_Store> findByArea(String area){
        List<Gn_Store> storeList = gn_storeService.findByArea(area);
        return storeList;

    }


}
