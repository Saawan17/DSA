package org.dsa.basicrecursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    static void reverseArray(int l, int r) {
        if (l == r)
            return;


    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arr1 = Arrays.asList(arr);
        Collections.reverse(arr1);
        System.out.println(arr1);

        int[] ar = {1, 2, 3, 4, 5};
        int i = 0, j = arr.length - 1;
        while (i != j) { // 1, 2 ,3 , 4, 5
            swap(ar, i, j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(ar));

        int[] a = {1, 2, 3, 4, 5, 6};
        int last = a.length;

        for (int k = 0; k < (last / 2); k++) {
            swap(a, k, last - k - 1);
        }
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] ar, int i, int j) {
        int temp = ar[j];
        ar[j] = ar[i];
        ar[i] = temp;
    }


}

