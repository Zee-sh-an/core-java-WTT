package MainExcersie;

import java.util.ArrayList;
import java.util.LinkedList;

//-->Arraylist vs. LinkedList Performance
public class Question8 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
//      time complexity of adding an element is O(1)
        double startTime =System.nanoTime();
        arrayList.add(56);
        arrayList.add(50);
        arrayList.add(66);
        arrayList.add(67);
        arrayList.add(68);
        arrayList.add(691);
        arrayList.add(692);
        arrayList.add(693);
        arrayList.add(694);
        arrayList.add(695);
        arrayList.add(69);
        double endTime =System.nanoTime();
        double executeTime = (endTime-startTime);
        System.out.println("execution time of array list to add is "+executeTime+"ns");

//      time complexity of adding an element to a specific index is O(n)
        arrayList.add(1,99);


//      time complexity of removing an element is O(n)
        arrayList.remove(3);

//      time complexity of removing an element for a specific condition is O(n)
        arrayList.removeIf(n->(n==68));

//      time complexity of getting an element is O(n)
        arrayList.get(2);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
//      time complexity of adding an element is O(1) (generally it adds from last)
        double startTime1 =System.nanoTime();
        linkedList.add(56);
        linkedList.add(57);
        linkedList.add(58);
        linkedList.add(59);
        linkedList.add(60);
        linkedList.add(61);
        linkedList.add(620);
        linkedList.add(629);
        linkedList.add(628);
        linkedList.add(627);
        linkedList.add(626);
        double endTime1 =System.nanoTime();
        double executeTime1 = (endTime1-startTime1);
        System.out.println("Execution time of linkedlist to add "+executeTime1+" ns");

//      time complexity of adding an element at a specific index is O(n)
        linkedList.add(1,99);

//      time complexity of adding an element from last is O(1)
        linkedList.addFirst(88);

//      time complexity of removing an element is O(1) (generally it removes from last)
        linkedList.remove(2);

//      time complexity of removing an element from first is O(1)
        linkedList.removeFirst();

//      time complexity of removing an element from a specific condition is O(n)
        linkedList.removeIf(n ->(n==61));

//      time complexity of adding an element is O(n)
        linkedList.get(2);

//      time complexity of getting an element from first is O(1)
        linkedList.getFirst();

        System.out.println(linkedList);
    }
}
