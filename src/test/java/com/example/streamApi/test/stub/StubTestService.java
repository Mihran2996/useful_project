package com.example.streamApi.test.stub;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class StubTestService {


    @Test
    public void testGetDataFromService() {
        Service service = new Service(new ServiceListImpl());
        assertEquals(2, service.getDataFromService().size());
        assertEquals("Poxos", service.getDataFromService().get(0));
        assertEquals("Petros", service.getDataFromService().get(1));

    }

    public class ServiceListImpl implements ServiceList {

        @Override
        public List<String> getData() {
            return Arrays.asList("Poxos", "Petros", "Martiros", "Valod");
        }
    }

    @Test
    public void testGetDataFromService2() {
        ServiceList serviceList = Mockito.mock(ServiceList.class);
        List<String> getData = Arrays.asList("Poxos", "Petros", "Martiros", "Valod");

        when(serviceList.getData()).thenReturn(getData);

        Service service = new Service(serviceList);
        assertEquals(2, service.getDataFromService().size());
        assertEquals("Poxos", service.getDataFromService().get(0));
        assertEquals("Petros", service.getDataFromService().get(1));


    }
}