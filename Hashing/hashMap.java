package Hashing;

import java.util.*;
public class hashMap{

    public static void main(String args[])
    {
        HashMap<String,Integer> hm=new HashMap<>();


        //put
        hm.put("india",100);
        hm.put("china",150);
        hm.put("us",50);


        //get
        int population=hm.get("india");

        System.out.println(hm);
        System.out.println(population);

        //System.out.println(hm.get("indonesia"));  return null


        //containsKey
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indonesia"));

        //remove
        System.out.println(hm.remove("india"));
    }
} 