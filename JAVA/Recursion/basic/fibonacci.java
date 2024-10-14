import java.util.*;
public class fibonacci{
    public static void fiboN(int x, int a, int b){
        if(x==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fiboN(x-1, b, c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Your Fibonacci Series: ");
        System.out.println(a);
        System.out.println(b);
        fiboN(x-2,a,b);
        sc.close();
    }
}
