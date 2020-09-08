package insertion;
import java.util.*; 
//Worst Case Big O Notation O(n*2)
// implementing data at index 0 is sorted
//Main class 
public class Main{ 
    public static void main(String [] args){
        int userin;
        int [] result;
        System.out.println("Insertion Sort Algorithm");
        System.out.println("Length of an Array:");
        Scanner input = new Scanner(System.in);
        userin = input.nextInt();
        Solution object_1 = new Solution();
        int [] Array = object_1.GettingAnArrayInput(userin);
        result = object_1.InsertionSort(Array);
        object_1.PrintingAnArray(result);

    }
}
//Seperate Class for the algorithm
//Solution класс үүсгэх
class Solution{
    //Массивт гараас утга авах.
    //Getting input in Array(Method)
    public int[] GettingAnArrayInput(int len_of_number){
        int array[] = new int[len_of_number];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements of an Array:");
        for(int val = 0; val < len_of_number; val++){
            array[val] = input.nextInt();
        }
        return array;
    }
    //Sort хийх функц.
    //InsertionSort Method
    public int[] InsertionSort(int[] array){
         for(int unsortedelement = 1; unsortedelement < array.length; unsortedelement++){
             int newElement = array[unsortedelement];
             int idx;
             for(idx = unsortedelement; idx > 0 && array[idx - 1] > newElement; idx--){
                 array[idx] = array[idx-1];
             }
             array[idx] = newElement;
         }
         return array;
    }
    //Printing to Screen Method
    //Дэлгэцэнд хэвлэх функц.
    public void PrintingAnArray(int[] Array){
        System.out.println("Sorted Elements");
        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}