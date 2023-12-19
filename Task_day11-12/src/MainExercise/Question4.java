package src.MainExercise;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question4 {
    public static void main(String[] args) {

        LinkedList<Character> characters=new LinkedList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');

        ListIterator<Character> listIterator=characters.listIterator();

        while (listIterator.hasNext()){

            char element=listIterator.next();
            if (element=='A'||element=='E'||element=='I'||element=='O'||element=='U'){
                listIterator.set('*');
            }else{
            }
        }
        ListIterator<Character> listIterator1= characters.listIterator();
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }

    }
}
