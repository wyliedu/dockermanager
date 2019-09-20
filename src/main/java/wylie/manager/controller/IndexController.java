package wylie.manager.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController extends BaseController {

    @Value("${test:abc}")
    private String test;

    @RequestMapping("/index")
    public String index(){
        System.out.println(test);
        return "index";
    }

}