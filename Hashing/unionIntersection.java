package Hashing;

import java.util.*;

public class unionIntersection {

    public static void main(String args[]) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 6, 2, 4 };
        HashSet<Integer> hs = new HashSet<>();

        // union

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        System.out.println("UNION=" + hs.size());

        hs.clear();

        // intersection

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[1]);
        }

        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i]))
            {
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("INTERSECTION="+count);
    }

}
