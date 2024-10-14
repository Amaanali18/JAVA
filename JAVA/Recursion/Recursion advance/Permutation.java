import java.util.*;
public class Permutation {
    public static void perm(String s,String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr_char = s.charAt(i);
            String nS = s.substring(0, i)+s.substring(i+1);
            perm(nS, permutation+curr_char);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Your String's Permutations: ");
        perm(s, "");
        sc.close();
    }
}
