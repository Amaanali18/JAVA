/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;
class TestClass {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = x*2;
       String s = sc.nextLine();
       System.out.println(y);
       System.out.println(s);
       sc.close();
    }
}
