import java.util.*;
public class QuickSort {
    public static int partition(int[] array, int low,int high){
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                //swap
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp=array[i];
        array[i]=pivot;
        array[high]=temp;
        return i;
    }
    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int pidx = partition(array,low,high);
            quickSort(array, low, pidx-1);
            quickSort(array, pidx+1, high);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int x = sc.nextInt();
        int[] array = new int[x];
        for(int i=0;i<x;i++){
            System.out.println("enter your "+(i+1)+" element of array");
            array[i]=sc.nextInt();
        }
        quickSort(array, 0, x-1);
        for(int i=0;i<x;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}

