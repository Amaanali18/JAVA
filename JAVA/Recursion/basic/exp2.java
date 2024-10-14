import java.util.*;
public class exp2 {
    public static int expn(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return expn(x, n/2)*expn(x, n/2);
        } else {
            return expn(x, n/2)*expn(x, n/2)*x;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int f = expn(x, n);
        System.out.println(f);
        sc.close();    
    }
}
