package org.wangss.Mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.wangss.Model.CommonUser

/**
 * Created by zll on 2017/5/24.
 */

@Mapper
interface ICisMapper {
    @Select("select * from dt_common_user where username=#{username} and password =#{password}")
    fun queryUserById(username: String, password: String): CommonUser
}