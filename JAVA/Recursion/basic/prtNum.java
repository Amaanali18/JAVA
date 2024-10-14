import java.util.*;
public class prtNum {
    public static void printNum(int n,int x){
        if(n==(x+1)){
            return;
        }
        System.out.println(n);
        printNum(n+1,x);
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ending num: ");
        int x = sc.nextInt();
        System.out.println("Your series: ");
        int n=1;
        printNum(n,x);
        sc.close();
    }
}
