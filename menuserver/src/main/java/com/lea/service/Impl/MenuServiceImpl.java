package com.lea.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lea.dao.MenuDao;
import com.lea.dao.TypeDao;
import com.lea.entity.TMenu;
import com.lea.entity.Type;
import com.lea.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;
    @Autowired
    private TypeDao typeDao;


    @Override
    public List<TMenu> findAll() {
        return menuDao.selectList(null);
    }

    @Override
    public IPage findAllByPage(int page, int limit) {
        IPage<TMenu> iPage=new Page<TMenu>(page,limit);
        return menuDao.selectPage(iPage, null);
    }

    @Override
    public List<TMenu> findAllByPageXml(int page, int limit) {

        return menuDao.findAll(((page-1)*limit),limit);
    }

    @Override
    public int findCount() {
        return menuDao.findCount();
    }


    @Override
    public void deleteById(int id) {
         menuDao.deleteById(id);
    }

    @Override
    public TMenu findById(int id) {
        return menuDao.findById(id);
    }

    @Override
    public List<Type> findAllType() {
        return typeDao.selectList(null);
    }

    @Override
    public void save(TMenu menu) {
         menuDao.save(menu); ;
    }

    @Override
    public void update(TMenu menu) {
        menuDao.update(menu);
    }
}
