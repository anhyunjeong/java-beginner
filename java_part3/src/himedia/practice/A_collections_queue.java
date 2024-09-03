package himedia.practice;

import java.util.*;

class A_person{
    String name;
    int age;
    public A_person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name+"("+age+")";
    }

}

public class A_collections_queue {

    public static void exam1() {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("size before : " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("size after : " + queue.size());

        System.out.println("size before : " + queue.size());
        System.out.println("Poll : " + queue.poll());
        System.out.println("size after : " + queue.size());
        System.out.println("Poll : " + queue.poll());
        System.out.println("size after : " + queue.size());

        queue.clear();
        System.out.println("Queue is empty : " + queue.isEmpty());

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        for (String element : queue) {
            System.out.println("Element : " + element);
        }
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element : " + element);
        }
    }

    public static void exam2(){
        Queue<Integer> priorityQueue=new PriorityQueue<>();

        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(10);

        System.out.println("Peek : "+priorityQueue.peek());
        System.out.println("Poll : "+priorityQueue.poll());

        for(Integer element: priorityQueue){
            System.out.println("Element : " +element);
        }
        Iterator<Integer> iterator = priorityQueue.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println("Element : "+element);
        }
        priorityQueue.forEach(
                element-> System.out.println("Element : "+element)
        );
    }

    public static void exam2_2(){
        Comparator<A_person> ageComp=new Comparator<A_person>() {
            @Override
            public int compare(A_person o1, A_person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Queue<A_person> priorityQueue=new PriorityQueue<>(ageComp);

        priorityQueue.add(new A_person("Alice",20));
        priorityQueue.add(new A_person("Bob",30));
        priorityQueue.add(new A_person("Charlie",10));
        priorityQueue.add(new A_person("David",50));

        System.out.println("Peek : "+priorityQueue.peek());

//        for(A_person element : priorityQueue){
//            System.out.println("Element : "+element);
//        }
        while(!priorityQueue.isEmpty()){
            A_person element=priorityQueue.poll();
            System.out.println("Element : "+element);
        }
    }

    public static void exam2_3(){
        Comparator<A_person> ageComp=new Comparator<A_person>() {
            @Override
            public int compare(A_person o1, A_person o2) {
                return Integer.compare(o2.getAge(),o1.getAge());
            }
        };

        Queue<A_person> priorityQueue=new PriorityQueue<>(ageComp);

        priorityQueue.add(new A_person("Alice",20));
        priorityQueue.add(new A_person("Bob",30));
        priorityQueue.add(new A_person("Charlie",10));
        priorityQueue.add(new A_person("David",50));

        while(!priorityQueue.isEmpty()){
            A_person element=priorityQueue.poll();
            System.out.println("Element : element");
        }
    }

    public static void exam2_4(){
        Comparator<A_person> nameComp=new Comparator<A_person>() {
            @Override
            public int compare(A_person o1, A_person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Queue<A_person> priorityQueue=new PriorityQueue<>(nameComp);

        priorityQueue.add(new A_person("Alice",20));
        priorityQueue.add(new A_person("Bob",30));
        priorityQueue.add(new A_person("Charlie",10));
        priorityQueue.add(new A_person("David",50));

        while(!priorityQueue.isEmpty()){
            A_person element = priorityQueue.poll();
            System.out.println("Element : " +element);
        }
    }
    public static void exam2_5(){
        Comparator<A_person> nameComp=new Comparator<A_person>() {
            @Override
            public int compare(A_person o1, A_person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };

        Queue<A_person> priorityQueue=new PriorityQueue<>(nameComp);

        priorityQueue.add(new A_person("Alice",20));
        priorityQueue.add(new A_person("Bob",30));
        priorityQueue.add(new A_person("Charlie",10));
        priorityQueue.add(new A_person("David",50));

        while(!priorityQueue.isEmpty()){
            A_person element=priorityQueue.poll();
            System.out.println("Element : " + element);
        }
    }

    public static void exam3(){
        Queue<String> arrayQueue=new ArrayDeque<>();

        arrayQueue.add("Apple");
        arrayQueue.add("Banana");
        arrayQueue.add("Orange");

        System.out.println("Peek : "+arrayQueue.peek());
        System.out.println("Poll : "+arrayQueue.poll());
    }

    public static void main(String[] args) {
        exam2_5();
    }
}