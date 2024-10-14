import java.util.*;
public class SelectSort{
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
        // Selection sort
        for(int i=0;i<size-1;i++){
            // smallest counter
            int sml = i;
            for(int j=i+1;j<size;j++){
                //change smallest num
                if(nums[sml]>nums[j]){
                    sml=j;
                }
            }
            // create temparory variable to swap
            int temp = nums[sml];
            nums[sml]=nums[i];
            nums[i]=temp;
        }
        System.out.println("Sorted array: "+Arrays.toString(nums));
        sc.close();
    }
}