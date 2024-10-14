import java.util.*;
public class expo {
    public static int expN(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pwr1 = expN(x, n-1);
        int pwr2 = x*pwr1;
        return pwr2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        System.out.println("Enter your power: ");
        int n = sc.nextInt();
        System.out.println("Your Power Table: ");
        int ans=expN(x, n);
        System.out.println(ans);
        sc.close();
    }
}
