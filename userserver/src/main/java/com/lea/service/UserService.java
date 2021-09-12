package com.lea.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lea.entity.TUser;

import java.util.List;

public interface UserService {
    IPage<TUser> findAll(int page, int limlt);

    void save(TUser tUser);

    void update(TUser tUser);

    void deleteById(int id);

    TUser findById(int id);
}
