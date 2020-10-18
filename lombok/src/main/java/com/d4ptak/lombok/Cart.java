package com.d4ptak.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder(toBuilder = true)
public class Cart {

    @Singular
    private final List<Integer> singularItemIds;

    private final List<Integer> itemIds;

}
