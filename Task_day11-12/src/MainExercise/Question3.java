package MainExercise;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(879);
        arrayList.add(406);
        arrayList.add(387);
        arrayList.add(84);
        arrayList.add(240);
        arrayList.add(533);

        arrayList.set(3,5);

        arrayList.remove(2);

        for (Integer i: arrayList) {
            System.out.println(i);
        }
    }
}
