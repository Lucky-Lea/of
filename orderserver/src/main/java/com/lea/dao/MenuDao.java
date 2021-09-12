package com.lea.dao;

import com.lea.entity.TMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuDao{

 public List<TMenu> findAll(int page,int limit);

 public int findCount();

 public void save(TMenu menu);

 TMenu findById(int id);

 void update(TMenu menu);
}
