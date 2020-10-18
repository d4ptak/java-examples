package com.d4ptak.singleton;

class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    static EagerSingleton getInstance() {
        return instance;
    }

    boolean isPresent() {
        return true;
    }

}
