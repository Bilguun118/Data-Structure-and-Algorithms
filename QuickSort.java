package quicksorting;

import java.util.*;
public class Main{
    //Main функц.
    public static void main(String [] args){
        int listlength;
        int [] beforesort;
        Scanner input = new Scanner(System.in);
        System.out.println("Quick Sort implementation");
        System.out.println("Enter length of an Array:");
        listlength = input.nextInt();
        //Creating class instances
        //Классын объектыг үүсгэх.
        QuickSort fastsorting = new QuickSort();
        beforesort = fastsorting.gettinginput(listlength);
        fastsorting.quicksorting(beforesort, 0, beforesort.length);
    }
}

//Сорт хийх класс.
class QuickSort{
    //getting user input in to list
    //Массив-д хэрэглэгчээс утга авах.
    public int[] gettinginput(int lengthD){
        int[] list = new int[lengthD];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list elements");
        for(int i = 0; i < lengthD; i++){
            list[i] = input.nextInt();
        }
        return list;
    }
    //quick sorting method
    //Сорт хийх рекурс функц
    public static void quicksorting(int[] array, int start, int end){
        if (end - start < 2){
            return;
        }
        //partition функцийн утгийг pivotIndex хувьсагчид хадгалах.
        int pivotIndex = partition(array, start, end);
        //Рекурс функцээр сорт хийх.
        quicksorting(array, start, pivotIndex);
        System.out.println("Sorting Elements");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        quicksorting(array, pivotIndex + 1, end);
        
    }

    public static int partition(int [] array, int start, int end){
        //First element as pivot 
        //Массивийн эхний элементыг pivot болгож авна. 
        int pivot = array[start];
        int i = start;
        int j = end;
        //баруун зүүн хоёр хэсгийг pivot дээр үндэслэн сорт хийх 
        while(i < j){
            //Empty loop
            //Хоосон давталт
            while(i < j && array[--j] >= pivot);
            if (i < j ){
                array[i] = array[j];
            }

            //Empty loop
            //Хоосон давталт
            while(i < j && array[++i] <= pivot);
            if (i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}