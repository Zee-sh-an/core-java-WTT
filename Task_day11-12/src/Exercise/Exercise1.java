package src.Exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Exercise1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(90);
        arrayList.add(639);
        arrayList.add(922);
        arrayList.add(379);
        arrayList.add(733);
        arrayList.add(107);
        arrayList.add(521);

        System.out.println("Printing list Using Arraylist");
        System.out.println(arrayList);

        System.out.println("Printing list Using foreach loop");
        for (int list: arrayList) {
            System.out.println(list);
        }

        Iterator<Integer> iterator = arrayList.iterator();

        System.out.println("Printing list Using Iterator");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Iterator<Integer> iterator1 = arrayList.iterator();

        System.out.println("Printing list After removing the element 90 in Iterator ");

        while (iterator1.hasNext()){
            int element=iterator1.next();
            if (element==90){
                iterator1.remove();//-->here we remove the element in iterator
            }else {
                System.out.println(element);
            }
            }

    ListIterator<Integer> listIterator= arrayList.listIterator();
        listIterator.add(649);//-->here we add the element in list iterator
        System.out.println("Printing list Using listIterator");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        listIterator.set(6);//-->here we set the element in list iterator

        ListIterator<Integer> listIterator1 = arrayList.listIterator();
        System.out.println("Printing list After adding the element 649 and deleting the element 379 in listIterator");

        while (listIterator1.hasNext()){
            int element=listIterator1.next();
            if (element==379){
            listIterator1.remove();//-->here we are removing the element in list iterator
        }else {
                System.out.println(element);
            }
        }
    }
}
