import java.util.*;
public class factN {
    public static int factOfN(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact2 = factOfN(n-1);
        int fact1 = n*fact2;
        return fact1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your factorial number: ");
        int n = sc.nextInt();
        int fn = factOfN(n);
        System.out.println("Factorial of "+n+" is "+fn);
        sc.close();
    }
}

