package himedia.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class A_collections_list {
    public static void exam1(){
        List<String> list=new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.add(1,"Grape");

        System.out.println("List size : "+list.size());

        System.out.println("Element at index 2 : "+list.get(2));

        list.remove(3);

        System.out.println("List element : "+list);

        if(list.contains("Apple")){
            System.out.println("Apple founnd");
        }
//
//        list.clear();
//        System.out.println("List after clear : "+list);

        for(int i=0;i<list.size();i++){
            System.out.println(i+" : "+list.get(i));
        }

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String element=iterator.next();
            System.out.println("Iterator : "+element);
        }

        while(iterator.hasPrevious()){
            String element= iterator.next();
            System.out.println("Iterator : "+element);
        }
    }

    public static void exam2(){
        List<String> list=new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.add(1,"Grape");

        System.out.println("List size : "+list.size());

        System.out.println("Element at index 2 : "+list.get(2));

        list.remove(3);

        System.out.println("List elements : "+list);

        if(list.contains("Apple")){
            System.out.println("Apple found");
        }

        list.clear();
        System.out.println();
    }
}
