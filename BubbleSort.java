package bubblesort;

import java.util.*;
//Worst Case Big O Notation O(N**2)
//Main Class
public class Main{
    public static void main(String [] args){
        int lenarray;
        int[] data,result; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of an array:");
        lenarray = input.nextInt();
        //Creating Class instance 
        BubbleSorting object1 = new BubbleSorting();
        data = object1.gettinginputtoarray(lenarray);
        System.out.println("Array before bubble sorting");
        for(int idx = 0; idx < data.length; idx++){
            System.out.println(data[idx]);
        }
        //функц дуудах.
        result = object1.BubbleSort(data);
        System.out.println("Array after bubble sorting");
        for(int el = 0; el < result.length; el++){
            System.out.println(result[el]);
        }
    }
}

//Seperate class for Solution
//Сорт хийх класс.
class BubbleSorting{
    //массив гараас утга авах.
    public int[] gettinginputtoarray(int lenarr){
        int[] Array = new int[lenarr];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value for an array:");
        for(int element = 0; element < lenarr; element++){
            Array[element] = input.nextInt();
        }
        return Array;
    }
    //Сорт хийх функц - Method
    public int[] BubbleSort(int[] Larray){
     int lengtharr = Larray.length;
     int temp = 0;
     for(int value = 0; value < lengtharr; value++){
         for(int i = 1; i < (lengtharr - value); i++){
             if(Larray[i-1] > Larray[i]){
                 temp = Larray[i-1];
                 Larray[i-1] = Larray[i];
                 Larray[i] = temp;
             }
         }
      }  
      return Larray; 
    }
}
