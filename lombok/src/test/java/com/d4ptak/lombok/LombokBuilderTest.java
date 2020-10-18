package com.d4ptak.lombok;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LombokBuilderTest {

    @Test
    void toBuilderWithSingularTest() {
        // given
        final Cart cart = Cart.builder()
            .singularItemIds(List.of(1, 2, 3))
            .build();

        // when
        final Cart newCart = cart.toBuilder()
            .singularItemIds(List.of(4, 5))
            .build();

        //then
        assertThat(newCart.getSingularItemIds()).isEqualTo(List.of(1, 2, 3, 4, 5));
    }

    @Test
    void toBuilderWithClearSingularTest() {
        // given
        final Cart cart = Cart.builder()
            .singularItemIds(List.of(1, 2, 3))
            .build();

        // when
        final Cart newCart = cart.toBuilder()
            .clearSingularItemIds()
            .singularItemIds(List.of(4, 5))
            .build();

        //then
        assertThat(newCart.getSingularItemIds()).isEqualTo(List.of(4, 5));
    }

    @Test
    void toBuilderWithoutSingularTest() {
        // given
        final Cart cart = Cart.builder()
            .itemIds(List.of(1, 2, 3))
            .build();

        // when
        final Cart newCart = cart.toBuilder()
            .itemIds(List.of(4, 5))
            .build();

        //then
        assertThat(newCart.getItemIds()).isEqualTo(List.of(4, 5));
    }
}
