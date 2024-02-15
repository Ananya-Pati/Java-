package array;
import java.util.*;

public class binarySearch {
    public static int binary_Search(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key)// right side
            {
                start = mid + 1;
            } else {// left side
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 2;
        System.out.println("the number is present in " + binary_Search(number, key));
    }

}
