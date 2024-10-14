import java.util.*;
public class printNum{
    public static void prtNum(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            prtNum(n-1);
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prtNum(n);
        sc.close();
    }   
}