import java.util.*;
public class BubbleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //input size of array
        System.out.println("Enter your array size: ");
        int n = sc.nextInt();
        // make array of given size=n
        int[] arr = new int[n];
        // input elements in array
        for(int i=0;i<n;i++){
            System.out.println("Enter your "+(i+1)+" element of array");
            arr[i]=sc.nextInt();
        }
        //print your original array
        System.out.println("Your original array is "+Arrays.toString(arr));
        // bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    //create a temparory variable to store and swap values
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //print your sorted array
        System.out.println("Your sorted array is "+Arrays.toString(arr));
        sc.close();
    }
}
