package com.yangjchang.b_factory.factory;

import com.yangjchang.b_factory.dao.DemoDao;
import com.yangjchang.b_factory.dao.impl.DemoDaoImpl;
import com.yangjchang.b_factory.dao.impl.DemoOracleImpl;

/**
 * @Author: 杨佳畅
 * @Description: 引入静态工厂
 */
public class BeanFactory {

    public static DemoDao getDemoDao() {
        return new DemoDaoImpl();
    }
}
