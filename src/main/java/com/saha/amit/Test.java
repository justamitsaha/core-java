package com.saha.amit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        create(al);
        create(ll);
//        fetch(al);
//        fetch(ll);
//        update(al);
//        update(ll);
        delete(al);
        delete(ll);

        List<Integer> vl = new Vector<>();
        List<Integer> sl = new Stack<>();
    }

    static void create(List<Integer> lst) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            lst.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(lst.getClass() + " creation time " + (end - start));
    }

    static void fetch(List<Integer> lst) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            lst.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(lst.getClass() + " fetching time " + (end - start));
    }

    static void update(List<Integer> lst) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            lst.add(i, i + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println(lst.getClass() + " update time " + (end - start));
    }

    static void delete(List<Integer> lst) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            lst.remove(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(lst.getClass() + " size "+ lst.size());
        System.out.println(lst.getClass() + " delete time " + (end - start));
    }
}
