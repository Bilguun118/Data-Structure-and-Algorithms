package mergesort;

import java.util.*;

public class Main{
    //Main функц
    public static void main(String [] args){
        int [] array;
        int userinput;
        Scanner input = new Scanner(System.in);
        System.out.println("Merge Sorting Algorithm implementation");
        System.out.println("Enter the Array Length");
        userinput = input.nextInt();
        //Классын объектыг үүсгэх.
        MergeSorting sorting = new MergeSorting();
        array = sorting.gettinginput(userinput);
        sorting.mergesorting(array, 0, array.length);   
        System.out.println("Array After Sorted");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}


class MergeSorting{
    //Getting input in array
    //Массивт хэрэглэгчээс утга авах.
    public int [] gettinginput(int userinput){
        int[] Decarray = new int[userinput];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array elements");
        for (int val = 0; val < userinput; val++){
            Decarray[val] = input.nextInt();
        }
        return Decarray;
    }
    //MergeSort Function (method)
    //Сорт хийх функц.
    public static void mergesorting(int [] array, int start, int end){
        if (end - start < 2){
            return;
        }

        int middle = (start + end) / 2;
        mergesorting(array, start, middle);
        mergesorting(array, middle, end);
        merge(array, start, middle, end);
    }

    public static void merge(int [] array, int start, int middle, int end){
        if (array[middle - 1] <= array[middle]){
            return; 
        }

        int i = start;
        int j = middle;
        int Index = 0;

        int [] temp = new int[end - start];
        while(i < middle && j < end){
            temp[Index++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + Index, middle - i);
        System.arraycopy(temp, 0, array, start, Index);
    }
}