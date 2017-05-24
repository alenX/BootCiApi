package org.wangss.Controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.wangss.Mapper.ICiMapper
import org.wangss.Model.BootCi
import org.wangss.Model.Ci

/**
 * Created by zll on 2017/5/23.
 */
@RequestMapping("/ci/apis")
@RestController
class CisController {
    @Autowired
    private val ciMapper: ICiMapper? = null

    @RequestMapping("/id/{id}")
    fun queryCiById(@PathVariable id: String): Ci {

         return ciMapper!!.getCiById(id)
    }
}