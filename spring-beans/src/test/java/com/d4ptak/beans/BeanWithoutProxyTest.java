package com.d4ptak.beans;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfigWithoutProxy.class)
class BeanWithoutProxyTest extends AbstractBeanTest {

    @Test
    void applicationContextTest() {
        prepareInfo("APPLICATION CONTEXT TEST");
        prepareApplicationContextTest();
    }

    @Test
    void autowiredTest() {
        prepareInfo("AUTOWIRED TEST");
        prepareAutowiredTest();
    }
}
