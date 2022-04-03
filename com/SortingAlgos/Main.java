package com.SortingAlgos;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static com.SortingAlgos.InsertionSort.insertion_Sort;
import static com.SortingAlgos.MergeSort.mergeSort;
import static com.SortingAlgos.QuickSort.quickSort;

public class Main {




    public static void main(String[] args) {
        ArrayList <Integer> inArray = new ArrayList<Integer>(List.of(13,12,6,8,9,14,2,9,7,3));
        System.out.println("Before Sorting: "+ inArray);
        //insertion_Sort(inArray);
        quickSort(inArray);
        //mergeSort(inArray);
        System.out.println("After Sorting: "+ inArray);

    }

}
