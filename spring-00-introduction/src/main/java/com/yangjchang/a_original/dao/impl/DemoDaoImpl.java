package com.yangjchang.a_original.dao.impl;

import com.yangjchang.a_original.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 杨佳畅
 * @Description:
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
