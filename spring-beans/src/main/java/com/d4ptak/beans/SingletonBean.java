package com.d4ptak.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;

@Slf4j
class SingletonBean {

    private final PrototypeBean prototypeBean;

    private final ObjectFactory<PrototypeBean> objectFactory;

    SingletonBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        this.objectFactory = null;
        log.info("Singleton instance with inject bean created: " + this.toString());
    }

    SingletonBean(ObjectFactory<PrototypeBean> objectFactory) {
        this.prototypeBean = null;
        this.objectFactory = objectFactory;
        log.info("Singleton instance with inject factory created: " + this.toString());
    }

    void showMessage() {
        log.info("Show message prototype instance to string: " + getMessage());
    }

    private String getMessage() {
        if (objectFactory != null) {
            return objectFactory.getObject().toString();
        }
        return prototypeBean.toString();
    }
}
