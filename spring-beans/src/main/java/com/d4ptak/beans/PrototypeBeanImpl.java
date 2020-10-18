package com.d4ptak.beans;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PrototypeBeanImpl implements PrototypeBean {

    PrototypeBeanImpl() {
        log.info("Prototype instance created: " + this.toString());
    }
}
