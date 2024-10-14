import java.util.*;
public class MoveVar {
    public static void moveAllX(String s,int i,int count,String newS){
        if(i==s.length()){
            for(int j=0;j<count;j++){
                newS += 'x';
            }
            System.out.println(newS);
            return;
        }
        char currChar=s.charAt(i);
        if(currChar=='x'){
            count++;
            moveAllX(s, i+1, count, newS);
        }else{
            newS+=currChar;
            moveAllX(s, i+1, count, newS);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        moveAllX(s, 0, 0, "");
        sc.close();
    }
}
