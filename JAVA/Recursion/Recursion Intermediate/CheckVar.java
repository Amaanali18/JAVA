import java.util.*;
public class CheckVar {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String S,int i,String nS){
        if(i==S.length()){
            System.out.println(nS);
            return;
        }
        char currChar = S.charAt(i);
        if(map[currChar-'a']){
            removeDuplicate(S, i+1, nS);
        }else{
            nS+=currChar;
            map[currChar-'a']=true;
            removeDuplicate(S, i+1, nS);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String S = sc.nextLine();
        System.out.println("Your Trimmed String: ");
        removeDuplicate(S, 0, "");
        sc.close();
    }
}