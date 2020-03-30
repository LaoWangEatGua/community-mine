package com.mrbin.community.mapper;

import com.mrbin.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;


public interface UserMapper {

    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) " +
            "value(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}

