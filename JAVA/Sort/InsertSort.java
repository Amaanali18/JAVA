import java.util.*;
public class InsertSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // input size of array
        System.out.println("Enter your size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        // input nums to array
        for(int i=0;i<size;i++){
            System.out.println((i+1)+" num of array: ");
            nums[i]=sc.nextInt();
        }
        // print original array
        System.out.println("Original array: "+Arrays.toString(nums));
        // insertion sort
        for(int i=1;i<size;i++){
            int pnt = nums[i];
            int j=i-1;
            while(j>=0 && pnt<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=pnt;
        }
        System.out.println("Sorted array: "+Arrays.toString(nums));
        sc.close();
    }
}
