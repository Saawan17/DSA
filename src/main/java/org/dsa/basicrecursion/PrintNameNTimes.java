package org.dsa.basicrecursion;

public class PrintNameNTimes {
    public static void fun(int n, String name){
        if(n == 0)
            return;
        System.out.println(name);
        fun(n-1, name);

    }

    public static void main(String[] args) {
        String name = "Saawan";
        int n = 1;
        fun(n, name);
    }
}
