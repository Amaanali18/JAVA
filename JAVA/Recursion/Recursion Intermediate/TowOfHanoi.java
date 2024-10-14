import java.util.*;
public class TowOfHanoi{
    public static void towOfHanoi(int x,String src,String help,String dest){
        // Base Case
        if(x==1){
            System.out.println("Transfer disc "+x+" from "+src+" to "+dest);
            return;
        }
        // FUNCTION 1
        towOfHanoi(x-1, src, dest, help);
        System.out.println("Transfer disc "+x+" from "+src+" to "+dest);
        /*
        function 1 takes n-1 disc from src to helper
        now in fn 1 our helper is destination for those discs
        and destination is helper for them
        */
        // FUNCTION 
        towOfHanoi(x-1, help, src, dest);
        /*
        function 2 takes n-1 disc from helper to destination
        now in fn 2 our helper is src for those discs
        and destination is destination for them
        */
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number of discs present in tower: ");
        int x = sc.nextInt();
        towOfHanoi(x,"S","H","D");
        sc.close();
    }
}