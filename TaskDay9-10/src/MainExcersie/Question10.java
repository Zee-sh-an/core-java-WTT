package MainExcersie;

import java.util.*;

//--> Word Frequency Counter

public class Question10 {

    public static void main(String[] args) {


        String document="WalkingTree a Technologies is a product development enterprise with a prolific backend engineering team that serves customers across the globe. We deliver end-to-end products, processes, and solutions in the mobile";
        HashMap<String,Integer> hashMap=new HashMap<>();


        int count=1;

        ArrayList<String> t=new ArrayList<>();

        StringTokenizer tokenizer=new StringTokenizer(document," ");
        int tokenCount= tokenizer.countTokens();
        String [] stringArray =new String[tokenCount];

        for (int i = 0; i < tokenCount; i++) {
            stringArray[i] = tokenizer.nextToken();
        }

        for (String element : stringArray) {
            if (hashMap.containsKey(element)){
                hashMap.put(element,count+1);
            }else {
                hashMap.put(element,count);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));


        System.out.println(list);
//        System.out.println(hashMap);
//        System.out.println(hashMap.keySet());

    }

}
