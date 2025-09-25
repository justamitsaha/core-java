package com.saha.amit.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPerformance {
    public static void main(String[] args) {
        int counter = 900_000;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Amit");
        arrayList.add("Amit");
        arrayList.add("Amit");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Amit");
        linkedList.add("Amit");
        linkedList.add("Amit");
        updateListWithCounter(arrayList,linkedList,counter);
    }

    /*
    In theory list should take more time but we are using index this advantage which Linked list has
     */
    public static void updateListWithCounter(ArrayList<String> list1, LinkedList<String> list2, int counter){
        long start1 = System.currentTimeMillis();
        for (int i =0; i<counter; i++){
            //list1.add(Math.round(list1.size()/2),"Hello");
            //list1.add(i,"hello");
            list1.addFirst("hello");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken " +(end1-start1));

        long start2 = System.currentTimeMillis();
        for (int i =0; i<counter; i++){
            //list2.add(Math.round(list2.size()/2),"Hello");
            //list2.add(i,"hello");
            list2.addFirst("hello");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken " +(end2-start2));
    }



}
