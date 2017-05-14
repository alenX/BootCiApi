package org.wangss.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangss on 2017/5/12.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index.shtml")
    public String index(){
        return "index";
    }
}
