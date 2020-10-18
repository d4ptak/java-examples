package com.d4ptak.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
class AppConfigWithTargetClassProxy {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    PrototypeBeanImpl prototypeBean() {
        return new PrototypeBeanImpl();
    }

    @Bean
    SingletonBean singletonBean() {
        return new SingletonBean(prototypeBean());
    }
}
