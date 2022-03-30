package com.SortingAlgos;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void insertion_Sort(ArrayList<Integer> Arr){
        int size = Arr.size();
        if (size > 1){
            int i=0,k, key;
            while (i < size-1){
                key = Arr.get(i + 1);
                k = i;
                while (k >-1 && key< Arr.get(k)){
                    Arr.set(k+1,Arr.get(k));
                    k--;
                }
                Arr.set(k+1, key);
                System.out.println(i+1);
                i++;

            }

        }
    }

    public static void main(String[] args) {
        ArrayList <Integer> inArray = new ArrayList<Integer>(List.of(2,4,3,6));
        System.out.println("Before Sorting: "+ inArray);
        insertion_Sort(inArray);
        System.out.println("After Sorting: "+ inArray);

    }

}
