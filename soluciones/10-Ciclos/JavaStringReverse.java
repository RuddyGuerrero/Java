import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        int l = A.length(), x = 1;
        for (int i = 0; i < l/2; ++i){
             if (A.charAt(i) != A.charAt(l-i-1))
                x = 0;
        }
        
        if (x == 1)
            System.out.println("Yes");
        else
            System.out.println("No");       
    }
}