package wylie.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import wylie.manager.entity.AppBanner;
import wylie.manager.mapper.AppBannerMapper;

import java.util.List;

@Controller
public class IndexController extends BaseController {

    @Value("${test:abc}")
    private String test;
    @Autowired
    private AppBannerMapper appBannerMapper;

    @RequestMapping("/index")
    public String index(){
        System.out.println(test);
        getList();
        insert();
        return "index";
    }

    public void getList(){
        List<AppBanner> list = appBannerMapper.getAppBannerList();
    }

    public void insert(){
        AppBanner appBanner = new AppBanner();
        appBanner.setContent("11");
        appBannerMapper.insert(appBanner);
    }


}