package cn.kgc;

import cn.kgc.service.Gn_CarTypeService;
import cn.kgc.service.impl.Gn_CarTypeServiceImpl;
import cn.kgc.service.impl.Gn_StoreServiceImpl;

import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/gn_car")
public class Gn_CarTypeController {
    @Autowired
    Gn_CarTypeServiceImpl gn_carTypeService;
    @Autowired
    Gn_StoreServiceImpl gn_storeService;
    @RequestMapping("/show")
    public List<Gn_CarType> findAll(){
        List<Gn_CarType> gn_carList = gn_carTypeService.findAll();
        System.out.println(gn_carList.toString());
        return gn_carList;
    }

    //根据gn_sort查询
    @RequestMapping("/findBySort")
    public List<Gn_CarType> findBySort(String gn_sort){
        List<Gn_CarType> carList = gn_carTypeService.findBysort(gn_sort);
        return carList;
    }



    //选择车辆后，跳转到订单页面
    @RequestMapping("/findById")
    public Gn_CarType findById(Integer id){
        Gn_CarType car = gn_carTypeService.findById(id);

        return car;
    }
    //点击预定车辆之后，页面跳转到订单页面
    @RequestMapping("/order")
    public ModelAndView toOrder(Integer id){
        Gn_CarType car2 = gn_carTypeService.findById(id);

        ModelAndView mv = new ModelAndView();
        mv.addObject("car2",car2);
        mv.setViewName("order");
        return mv;
    }

    //点击取车门店，根据id显示门店信息
    @RequestMapping("/findById2")
    public ModelAndView findById2(Integer id){
        Gn_CarType typelist = gn_carTypeService.findById(id);
        System.out.println(typelist.getGn_store().getStoreName());
        ModelAndView mv = new ModelAndView();
        mv.addObject("typelist",typelist);
        mv.setViewName("order");
        return mv;
    }
}
