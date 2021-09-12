package com.lea.dao;

import com.lea.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderDao {
    public void save(TOrder order);
    public int countByUid(int uid);
    public List<TOrder> findAllByUid(int page, int limit,int uid);
    public List<TOrder> findByState(int page,int limit);
    public void updateState(int id);
    public int countByState();
}
