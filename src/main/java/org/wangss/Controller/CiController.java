package org.wangss.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangss.Mapper.ICiMapper;
import org.wangss.Model.BootCi;

/**
 * Created by wangss on 2017/5/12.
 */
@RequestMapping("/ci/api")
@RestController
public class CiController {


    @Autowired
    private ICiMapper ciMapper;

    @RequestMapping("/id/{id}")
    public BootCi queryCiById(@PathVariable String id) {
        return ciMapper.getBootCiById(id);
    }
}
