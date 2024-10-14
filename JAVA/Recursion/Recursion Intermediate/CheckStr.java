import java.util.*;
public class CheckStr {
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr, i+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isSorted(arr, 0));
        sc.close();
    }
}
