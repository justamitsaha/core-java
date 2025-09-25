package com.saha.amit.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPerformance {
    public static void main(String[] args) {
        int counter = 100_000;
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Amit");
//        arrayList.add("Amit");
//        arrayList.add("Amit");
//        updateList(arrayList,counter);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Amit");
        linkedList.add("Amit");
        linkedList.add("Amit");
        updateList(linkedList,counter);

    }

    public static void updateList(List<String> list, int counter){
        long start = System.currentTimeMillis();
        for (int i =0; i<counter; i++){
            list.add(Math.round(list.size()/2),"Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken " +(end-start));
    }


    public static void updateLinkedList(List<String> list, int counter){
        long start = System.currentTimeMillis();
        for (int i =0; i<counter; i++){
            list.add(Math.round(list.size()/2),"Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken " +(end-start));
    }
}
