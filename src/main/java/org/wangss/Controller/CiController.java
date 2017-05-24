package org.wangss.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wangss.Mapper.ICiMapper;
import org.wangss.Model.BootCi;

import java.util.List;

/**
 * Created by wangss on 2017/5/12.
 */
@RequestMapping("/ci/api")
@RestController
public class CiController {


    @Autowired
    private ICiMapper ciMapper;

    @Autowired
    protected RedisTemplate<String, Object> redisTemplate;


    @RequestMapping("/id/{id}")
    public BootCi queryCiById(@PathVariable String id) {
        return ciMapper.getBootCiById(id);
    }

    @RequestMapping("/author/{author}")
    public List<BootCi> queryCisByAuthor(@PathVariable String author){
        return ciMapper.getBootCisByAuthor(author);
    }
}