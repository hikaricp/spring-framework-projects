package com.yangjchang.b_factory.dao.impl;

import com.yangjchang.b_factory.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 杨佳畅
 * @Description:
 */
public class DemoMysqlDao implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("mysql", "mysql", "mysql");
    }
}
