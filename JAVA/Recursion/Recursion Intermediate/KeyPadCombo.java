import java.util.*;
public class KeyPadCombo {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printCombo(String s,int i,String combo){
        if(i==s.length()){
            System.out.println(combo);
            return;
        }
        char curr_char = s.charAt(i);
        String map = keypad[curr_char-'0'];

        for(int j=0;j<map.length();j++){
            printCombo(s, i+1, combo+map.charAt(j));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your combination: ");
        String s = sc.nextLine();
        printCombo(s, 0, "");
        sc.close();
    }
}
