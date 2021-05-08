package com.yangjchang.a_original.service.impl;

import com.yangjchang.a_original.dao.DemoDao;
import com.yangjchang.a_original.dao.impl.DemoDaoImpl;
import com.yangjchang.a_original.service.DemoService;

import java.util.List;

/**
 * @Author: 杨佳畅
 * @Description:
 */
public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
