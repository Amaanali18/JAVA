
import java.util.*;
public class MergeSort {
    // conquer class
    public static void conquer(int[] array, int s, int mid, int e){
        // new array 
        int[] merge = new int[e-s+1];
        // variables
        int x=0;
        int i1=s;
        int i2=mid+1;
        // loop till ARRAYS ARE MERGED
        while(i1<=mid&&i2<=e){
            if(array[i1]<=array[i2]){
                merge[x++]=array[i1++];
            }else{
                merge[x++]=array[i2++];
            }
        }
        // if any eleent is remaining add it at last
        while(i1<=mid){
            merge[x++]=array[i1++];
        }
        while(i2<=e){
            merge[x++]=array[i2++];
        }
        // insert the values to array
        for(int i=0,j=s;i<merge.length;i++,j++){
            array[j]=merge[i];
        }
    }
    // divide the array
    public static void divide(int[] array, int s, int e){
        if(s>=e){
            return;
        }
        // variable
        int mid = s+(e-s)/2;
        // divide the array
        divide(array, s, mid);
        divide(array, mid+1, e);
        // conquer it
        conquer(array, s, mid, e);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int j=0;j<size;j++){
            System.out.println("Enter your "+(j+1)+" value for array");
            array[j]=sc.nextInt();
        }
        divide(array, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.print(array[i]);
        }
        System.out.println();
        sc.close();
    }
}



