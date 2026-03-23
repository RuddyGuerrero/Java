import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i){
             a.add(scanner.nextInt());
        }
        
        int sol = 0;
        for (int i = 0; i < n; ++i){
             int sum = 0;
             for (int j = 0; i+j < n; ++j){
                  sum += a.get(i+j);   
                  if (sum < 0) sol+= 1;
             }
        }
        
        System.out.println(sol);
    }
}