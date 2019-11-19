package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    /*SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @Before
    public void before() {
        business.setSomeDataService(dataServiceMock);

    }*/

    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;

    @Test
    public void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        assertEquals(6, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSum_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSum_one() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        assertEquals(5, business.calculateSumUsingDataService());
    }

}