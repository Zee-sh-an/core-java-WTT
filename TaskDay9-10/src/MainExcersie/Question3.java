package MainExcersie;

import java.util.ArrayList;
import java.util.LinkedList;
// --> Linkedlist Exploration
public class Question3 {

    public static void main(String[] args) {

        ArrayList list=new ArrayList();
        list.add(8);
        list.add(9);
        list.add(11);
        list.add(110);
        list.add("Raju");

//        remove by index
        list.remove(1);

//      remove by object
        list.remove("Raju");

//      updating by giving index
        list.set(0,56);

        System.out.println(list);

//      Remove all element from list
        list.removeAll(list);


        System.out.println(list);

        LinkedList list1=new LinkedList();
        list1.offer(4);//we can use offer to add element in the list in offer it returns false if element don't add
        list1.offer(78);
        list1.offer(90);
        list1.add(33);//it returns exception if element don't add
        list1.add(67);
        list1.offer("Rajesh");
        list1.offer("Hot");
        list1.offer("Hot");
        list1.offer("Khanna");

        list1.remove();//it removes the top element

        list1.remove(4);//it removes by index of an element

        list1.remove("Hot");//it removes by object

        list1.removeFirst();//it also removes the first element

        list1.removeFirstOccurrence("Hot");//it removes the first occurence of element that particular element

        list1.removeLast();//as it's name it removes elements from last

        list1.removeLastOccurrence("Khanna");//it removes the last occurence of element that particular element

        list1.set(2,66);

        System.out.println(list1);

        list1.removeAll(list1);//it removes all element in the list

        System.out.println(list1);

        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(79);
        list2.add(4);
        list2.removeIf(n-> (n % 2==0));//it removes on condition that you enter here
        System.out.println(list2);

    }

}
