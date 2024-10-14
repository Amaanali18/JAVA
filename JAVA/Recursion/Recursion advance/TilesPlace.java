import java.util.*;
public class TilesPlace {
    public static int place(int i,int j,int m,int n){
        if(m==0||n==0){
            return 1;
        }
        if(i>m||j>n){
            return 0;
        }
        //vertically
        int vertPlace=0;
        if(i<=m){
            vertPlace=place(i, j, m, n-j);
        }
        //horizontally
        int hortPlace=0;
        if(j<=n){
            hortPlace=place(i, j, m-i, n);
        }
        return vertPlace+hortPlace;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your tile dimension ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Enter your floor dimension ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Total number of ways: "+place(i, j, m, n));
        sc.close();
    }
}
