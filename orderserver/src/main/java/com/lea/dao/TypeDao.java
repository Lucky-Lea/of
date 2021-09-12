package com.lea.dao;

import com.lea.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TypeDao {

    public Type findById(int id);



}
