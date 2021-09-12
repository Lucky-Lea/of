package com.lea.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lea.entity.TAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminDao extends BaseMapper<TAdmin> {
}
