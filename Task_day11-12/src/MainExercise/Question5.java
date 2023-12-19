package MainExercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Question5 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(374);
        arrayList.add(37);
        arrayList.add(34);
        arrayList.add(74);
        arrayList.add(3);

//        it will throw concurrent modification exception if we try to remove or add
//        because of multithreading concept some threads working on iterarting and another working on to remove while iterating
//        there will be overriding of threads and give exception
//        there is a specific way to remove element while iterating through iterator and has function iterator.remove
//        and adding the value can perform by lisIterator.add it add from last


        for (Integer arr: arrayList) {
//            arrayList.add(77);
            System.out.println(arr);
            arrayList.add(77);

        }

        for (Integer arr: arrayList) {
//            arrayList.add(77);
            System.out.println(arr);
            arrayList.remove(2);

        }

//        Iterator<Integer> iterator1 = arrayList.iterator();
//
//        System.out.println("Printing list After removing the element 90 in Iterator ");
//
//        while (iterator1.hasNext()){
//            int element=iterator1.next();
//            if (element==34){
//                iterator1.remove();//-->here we remove the element in iterator
//            }else {
//                System.out.println(element);
//            }
//        }


    }
}
