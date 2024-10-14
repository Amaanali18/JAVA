import java.util.*;
public class countPath{
    public static int countingPath(int i,int j,int m,int n){
        if(i==m-1||j==n-1){
            return 1;
        }
        return countingPath(i+1, j, m, n)+countingPath(i, j+1, m, n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you final x posn: ");
        int m = sc.nextInt();
        System.out.println("Enter you final y posn: ");
        int n = sc.nextInt();
        System.out.println("Counting different paths ....");
        int d = countingPath(0, 0, m, n);
        System.out.println("Total number of paths is: "+d);
        sc.close();
    }
}