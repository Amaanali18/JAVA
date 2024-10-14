import java.util.*;
public class sumN {
    public static int sumOfN(int n,int x,int sum){
        if(n==(x+1)){
            return sum;
        }
        return sumOfN(n+1,x,sum+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your x: ");
        int x = sc.nextInt();
        int n=1;
        int tSum = sumOfN(n, x,0);
        System.out.println("The sum of first n natural nums is: "+tSum);
        sc.close();
        }
    }

