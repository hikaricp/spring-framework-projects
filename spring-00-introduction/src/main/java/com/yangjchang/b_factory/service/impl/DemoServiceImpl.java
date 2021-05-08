package com.yangjchang.b_factory.service.impl;

import com.yangjchang.b_factory.dao.DemoDao;
import com.yangjchang.b_factory.factory.BeanFactory;
import com.yangjchang.b_factory.service.DemoService;

import java.util.List;

/**
 * @Author: 杨佳畅
 * @Description:
 */
public class DemoServiceImpl implements DemoService {

    // 使用静态工厂
    DemoDao demoDao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
