package Hashing;

import java.util.*;
public class itenaryForTickets {

    public static String getStart(HashMap<String ,String> hm)
    {
    HashMap<String,String> revhm=new HashMap<>();

    for(String key:hm.keySet())
    {
         revhm.put(hm.get(key),key);
    }
    for(String key:hm.keySet())
    {
        if(!revhm.containsKey(key)){
            return key;
        }
    }
    return null;
    }
    public static void main(String args[])
    {
        HashMap<String ,String> hm=new HashMap<>();
        hm.put("chennai","bangaluru");
        hm.put("mumbai","delhi");
        hm.put("goa","chennai");
        hm.put("delhi","goa");

        String start=getStart(hm);
        System.out.print(start);
        for(String key:hm.keySet())
        {
            System.out.print("->"+hm.get(start));
            start=hm.get(start);
        }
        System.out.println();
    }
    
}
