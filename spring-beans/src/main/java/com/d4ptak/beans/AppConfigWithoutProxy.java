package com.d4ptak.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class AppConfigWithoutProxy {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    PrototypeBeanImpl prototypeBean() {
        return new PrototypeBeanImpl();
    }

    @Bean
    SingletonBean singletonBean() {
        return new SingletonBean(prototypeBean());
    }

}
