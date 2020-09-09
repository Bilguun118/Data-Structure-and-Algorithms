package shellsort;

import java.util.*; 

//Main class
public class Main{
    public static void main(String [] args){
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        //Printing to Screen
        //Дэлгэцэнд хэвлэх
        System.out.println("Array before Shell sorting");       
        for(int bfr = 0; bfr < array.length; bfr++){
            System.out.println(array[bfr]);
        }
        //Shell Sorting algorithm Section
        //Worst Case Big O Notation O(n**2)
        //массивын уртыг 2-т хувааж тухайн тооны интервалаар элементүүдыг харьцуулан үзнэ.
        for(int gap = array.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i++){
                int newElement = array[i];
                int idx = i; 
                while(idx >= gap && array[idx - gap] > newElement){
                    array[idx] =array[idx - gap];
                    idx -= gap;
                }
                array[idx] = newElement;
            }
        }
        //Printing to Screen
        //Дэлгэцэнд хэвлэх
        System.out.println("Array after shell sorting");
        for(int val = 0; val < array.length; val++){
            System.out.println(array[val]);
        }

    }
}
