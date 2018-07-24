package com.madpointer.price;

import java.util.Arrays;
import java.util.List;

public class PriceService {

    private List<Integer> priceList = Arrays.asList(1, 2, 3, 4, 5);
    private final ExternalPriceInterface externalPriceInterface;

    public PriceService(ExternalPriceInterface externalPriceInterface) {
        this.externalPriceInterface = externalPriceInterface;
    }

    int getPrice() {
        return priceList.stream().mapToInt(Integer::intValue).sum() + externalPriceInterface.getPrice();
    }
}
