package com.d4ptak.beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfigWithInterfaceProxy.class)
class BeanWithInterfacesProxyTest extends AbstractBeanTest {

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
