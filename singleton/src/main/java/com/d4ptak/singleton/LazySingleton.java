package com.d4ptak.singleton;

class LazySingleton {

    private static LazySingleton instance = null;

    static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    boolean isPresent() {
        return true;
    }

}
