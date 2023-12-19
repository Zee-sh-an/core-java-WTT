package src.MainExercise;

import java.util.HashSet;
import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(517);
        hashSet.add(343);
        hashSet.add(9);
        hashSet.add(4);

        Iterator<Integer>  iterator= hashSet.iterator();

        while (iterator.hasNext()){

            int element=iterator.next();
            if (element>10){
                iterator.remove();
            }else {
                System.out.println(element);
            }
        }

    }
}
