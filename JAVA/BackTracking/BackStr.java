import java.util.*;
class BackStr{
    public static void backTrack(String s,String per,int i){
        if(s.length()==0){
            System.out.println(per);
            return;
        }
        for(int j=0;j<s.length();j++){
            char currChar = s.charAt(j);
            String ns = s.substring(0, j)+s.substring(j+1);
            backTrack(ns, per+currChar,i+1);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Running BackTracker.....");
        backTrack(s, "", 0);
        sc.close();
    }
}