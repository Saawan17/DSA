package org.dsa.basicmaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int n = 141;
        // T.C : 0(N)
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                //System.out.println(i);
//                arr.add(i);
//            }
//        }
//        System.out.println(arr);
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
                if (n / i != i) {
                    arr.add(n / i);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
