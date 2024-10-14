import java.util.*;
public class ReverseStr {
    public static void reverseString(String x,int idx){
        if(idx==0){
            System.out.print(x.charAt(idx));
            return;
        }
        System.out.print(x.charAt(idx));
        reverseString(x, idx-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String x = sc.nextLine();
        System.out.println("Your Original String: ");
        System.out.println(x);
        System.out.println("Your Reversed String: ");
        reverseString(x,x.length()-1);
        sc.close();
    }
}
