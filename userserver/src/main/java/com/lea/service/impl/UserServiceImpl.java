package com.lea.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lea.dao.UserDao;
import com.lea.entity.TUser;
import com.lea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public IPage<TUser> findAll(int page,int limit) {
            IPage<TUser> iPage=new Page(page,limit);
            IPage<TUser> tUserIPage = userDao.selectPage(iPage, null);
        tUserIPage.getTotal();
        return tUserIPage;
    }

    @Override
    public void save(TUser tUser) {
        userDao.insert(tUser);
    }

    @Override
    public void update(TUser tUser) {
        userDao.updateById(tUser);
    }

    @Override
    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    @Override
    public TUser findById(int id) {
        return userDao.selectById(id);
    }
}
