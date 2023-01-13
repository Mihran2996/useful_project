package com.example.streamApi.failFasAndFailSafeIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        //Iteratorner@ linumen erku tesaki1 Fail Fast ev Fail Safe
        //Fail Fast iterator@ iteraciayi jamanak erb pordzenq mofify anenq injvor element kunenanq ConcurrentModificationException
        //Fail Fast iterat@ uni modCount field  vor@ cuyce talis colection@ element@ popoxvace te che,ete popoxvace u menq modify enq anum element@ apa kunenanq exception@
        //Fail Safe i jamank menq chenq unena ayd exception@ ayn kpordzi naravorins efektiv popoxel object@ xusapelov exceptionic


        //Fail Fast iterator exapmple

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> failFast = list.iterator();
        while (failFast.hasNext()) {
            System.out.println(failFast.next());
            //we will get ConcurrentModificationException
//            list.add(6);
        }

        //Fail Safe iterator example
        CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>(list);

        Iterator<Integer> failSafe = arrayList.iterator();
        while (failSafe.hasNext()) {
            System.out.println(failSafe.next());
            if (!failSafe.hasNext()) {
                arrayList.add(99);
            }
        }

    }
}
