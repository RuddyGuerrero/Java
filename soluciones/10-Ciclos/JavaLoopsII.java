import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int p = 2;
            int s = a + b;
            System.out.print(s);
            for (int j = 1; j < n; ++j){
                 s = s + p * b;
                 p *= 2;
                 System.out.printf(" %d", s);
            }
            System.out.println();
        }
        in.close();
    }
}