import java.util.*;
public class SubsequenceStr {
    public static void sequenceStr(String s,int i,String ns){
        if(i==s.length()){
            System.out.println(ns);
            return;
        }
        char currChar = s.charAt(i);
        // to be
        sequenceStr(s, i+1, ns+currChar);
        // not to be
        sequenceStr(s, i+1, ns);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc.nextLine();
        System.out.println("Your subsequence strings: ");
        sequenceStr(s, 0, "");
        sc.close();
    }
}
