package MainExcersie;

//-->Country Capital Mapping

import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap=new HashMap<>();

        hashMap.put("India","Delhi");
        hashMap.put("Russia","Moscow");
        hashMap.put("Indonesia","Jakarta");
        hashMap.put("China","Beijing");

        System.out.println(hashMap);
//        Reitriving Capital by specifying Country
        System.out.println(hashMap.get("Russia"));

    }
}
