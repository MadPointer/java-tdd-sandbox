package com.madpointer.price;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PriceServiceTest {

    @Mock
    ExternalPrice externalPrice;

    @InjectMocks
    PriceService priceService;

    @Test
    public void priceService_should_return_correct_price(){
        when(externalPrice.getPrice()).thenReturn(10);

        int price = priceService.getPrice();

        assertEquals(price, 25);
        verify(externalPrice, times(1)).getPrice();
    }
}
