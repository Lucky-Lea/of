package com.lea.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lea.entity.TMenu;
import com.lea.entity.Type;
import com.mysql.cj.jdbc.result.UpdatableResultSet;

import java.util.List;

public interface MenuService {
    List<TMenu> findAll();

    IPage findAllByPage(int page, int limit);

    List<TMenu> findAllByPageXml(int page, int limit);

    int findCount();

    void deleteById(int id);

    TMenu findById (int id);

    List<Type> findAllType();

    void save(TMenu menu);

    void update(TMenu menu);
}
