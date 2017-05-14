package org.wangss.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.wangss.Model.BootCi;

/**
 * Created by wangss on 2017/5/14.
 */
@Mapper
public interface ICiMapper {

    @Select("select * from dt_boot_ci where id=#{id}")
    public BootCi getBootCiById(String id);

}
