package com.example.testing_with_mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.testng.annotations.Test;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTester {


    @InjectMocks
    CalculatorApplication calculatorApplication = new CalculatorApplication();

    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd() {

        when(calcService.add(10.0, 20.0)).thenReturn(30.00);

        assertEquals(calculatorApplication.add(10.0, 20.0), 30.0, 0);
    }

}
