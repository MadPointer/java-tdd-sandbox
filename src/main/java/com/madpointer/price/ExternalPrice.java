package com.madpointer.price;

public class ExternalPrice implements ExternalPriceInterface {
    @Override
    public int getPrice() {
        throw new RuntimeException(";)");
//        return 0;
    }
}
