package MainExcersie;

import java.util.HashSet;

//-->Unique Number set

public class Question4 {
    public static void main(String[] args) {

        Integer [] list={4,78,95,95,78,1,4,34};

        HashSet<Integer> hashSet = new HashSet<>();
        for (int a:list) {
            hashSet.add(a);
        }
        System.out.println(hashSet);
    }
}
