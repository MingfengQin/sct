package com.xiaoming.mapper;

import com.xiaoming.entity.Admin;

import java.util.Map;

public interface AdminDao {
    //新增接口
    public int save(Admin admin);

    //修改接口
    public int delete(Map<String,Object> param);

    

}
