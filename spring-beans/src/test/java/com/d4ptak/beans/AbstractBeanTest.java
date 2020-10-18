package com.d4ptak.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Slf4j
abstract class AbstractBeanTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private SingletonBean singletonBean;

    protected void prepareInfo(String testName) {
        log.info("------------------ " + testName + "--------------------");
    }

    protected void prepareApplicationContextTest() {
        SingletonBean firstSingleton = (SingletonBean) context.getBean("singletonBean");
        firstSingleton.showMessage();

        SingletonBean secondSingleton = (SingletonBean) context.getBean("singletonBean");
        secondSingleton.showMessage();
    }

    protected void prepareAutowiredTest() {
        singletonBean.showMessage();
    }
}
