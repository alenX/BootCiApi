package org.wangss.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.wangss.Model.BootCi;
import org.wangss.Model.Ci;

import java.util.List;

/**
 * Created by wangss on 2017/5/14.
 */
@Mapper
public interface ICiMapper {

    @Select("select * from dt_boot_ci where id=#{id}")
    public BootCi getBootCiById(String id);

    @Select("select * from dt_boot_ci where author=#{author}")
    public List<BootCi> getBootCisByAuthor(String author);

    @Select("select * from dt_ci where id=#{id}")
    public Ci getCiById(String id);

}
