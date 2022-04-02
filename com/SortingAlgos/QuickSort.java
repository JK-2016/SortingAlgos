package com.SortingAlgos;

import java.util.ArrayList;

public class QuickSort {

    public static void quickSort(ArrayList<Integer> Arr){
        int size = Arr.size();
        int lIndex=0, hIndex=size-1;

        quickie(Arr,lIndex,hIndex);

    }
    public static void quickie(ArrayList<Integer> Arr,int lIndex, int hIndex){
        if(lIndex<hIndex) {
            int pivot = Arr.get(hIndex);
            int pIndex = pivotIndex(Arr, pivot, lIndex, hIndex);//pivot is always last number
            quickie(Arr, lIndex, pIndex - 1);
            quickie(Arr, pIndex + 1, hIndex);
        }
    }
    public  static  void swap(ArrayList<Integer> Arr, int i , int j){
        int temp = Arr.get(i);
        Arr.set(i,Arr.get(j));
        Arr.set(j,temp);
    }
    public static int pivotIndex(ArrayList<Integer> Arr, int pivot, int lIndex, int pIndex){
        int i;
        for( i = lIndex; i<pIndex; i++){
            if(Arr.get(i)>pivot){
                swap(Arr,i,pIndex);
                pIndex=i;
            }
        }
        return pIndex;
    }

}
