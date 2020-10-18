package com.d4ptak.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingletonTest {

    @Test
    void EagerSingletonTest() {

        final boolean isPresent = EagerSingleton.getInstance().isPresent();

        assertThat(isPresent).isTrue();
    }

    @Test
    void EnumSingletonTest() {

        final boolean isPresent = EnumSingleton.I.isPresent();

        assertThat(isPresent).isTrue();
    }

    @Test
    void LazySingletonTest() {

        final boolean isPresent = LazySingleton.getInstance().isPresent();

        assertThat(isPresent).isTrue();
    }
}
