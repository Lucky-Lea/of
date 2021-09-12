package com.lea.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lea.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao extends BaseMapper<TUser> {
}
