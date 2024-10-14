import java.util.*;
public class FindElement {
    public static int first = -1;
    public static int last = -1;
    public static void findElement(String x,int i,String y){
        if(i==x.length()){
            System.out.println("First occurence of your element at "+first);
            System.out.println("last occurence of your element at "+last);
            return;
        }
        char currChar = x.charAt(i);
        if(currChar==y.charAt(0)){
            if(first==-1){
                first=i;
            }else{
                last=i;
            }
        }
        findElement(x, i+1, y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String x = sc.nextLine();
        System.out.println("Enter your element to find : ");
        String y = sc.nextLine();
        findElement(x, 0, y);
        sc.close();
    }
}
