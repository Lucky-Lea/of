package com.lea.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lea.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TypeDao extends BaseMapper<Type> {

    public Type findById(int id);



}
