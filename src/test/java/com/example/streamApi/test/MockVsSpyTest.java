package com.example.streamApi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockVsSpyTest {

    //spy - i depqum menqa karoxenq object@ spy anel injvor popoxutyunner anel vor@ irakanum chi azdi oreginal objecti vra
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        List<String> spyList = Mockito.spy(list);
        spyList.add("one");
        spyList.add("two");
        verify(spyList).add("one");
        verify(spyList).add("two");

        assertEquals(2, spyList.size());
        System.out.println(list.size());//list@ mnuma anpopox

    }

    @Spy
    private List<String> spyList2 = new ArrayList<>();

    @Test
    public void test2() {
        spyList2.add("three");
        spyList2.add("four");
        assertEquals(2, spyList2.size());
    }

    @Test
    public void test3() {
        List<String> list = new ArrayList<>();
        List<String> spyList = Mockito.spy(list);
        when(spyList.size()).thenReturn(100);

        assertEquals(100, spyList.size());
    }


    @Mock
    private List<String> list2 = new ArrayList<>();

    @Test
    public void test4() {
        list2.add("one");
        verify(list2).add("one");
//tvyal depqum list@ mnuma napopox,siz@ mnuma 0;
        assertEquals(0, list2.size());
    }

    @Test
    public void test5() {
        list2.add("one");
        when(list2.size()).thenReturn(1);
        //ays paragayum siz@ 1-a,vorovhetev arden aselenq vor ete kanchenq siz@ veradradzra 1;
        assertEquals(1, list2.size());
    }
}