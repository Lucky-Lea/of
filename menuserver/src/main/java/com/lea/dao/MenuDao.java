package com.lea.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lea.entity.TMenu;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
@Mapper
public interface MenuDao extends BaseMapper<TMenu> {

 public List<TMenu> findAll(int page,int limit);

 public int findCount();

 public void save(TMenu menu);

 TMenu findById(int id);

 void update(TMenu menu);
}
