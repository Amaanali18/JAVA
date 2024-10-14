import java.util.*;
public class UniqueStr {
    public static void uniqueString(String s,int i,String ns,HashSet<String> set){
        if(i==s.length()){
            if(set.contains(ns)){
                return;
            }else{
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        char curr_char = s.charAt(i);
        // tb
        uniqueString(s, i+1, ns+curr_char, set);
        //ntb
        uniqueString(s, i+1, ns, set);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        uniqueString(s, 0, "", set);
        sc.close();
    }
}
