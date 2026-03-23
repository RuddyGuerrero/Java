import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
         ArrayList<ArrayList<Integer>> a = new ArrayList<>();
         int n = scanner.nextInt();
         
         for (int i = 0; i < n; ++i){
              ArrayList<Integer> b = new ArrayList<>();
              int m = scanner.nextInt();
              for (int j = 0; j < m; ++j)
                   b.add(scanner.nextInt());
              a.add(b);  
         }
         
         n = scanner.nextInt();
         for (int i = 0; i < n; ++i){
              int x = scanner.nextInt() - 1;
              int y = scanner.nextInt() - 1;
              if (a.size() > x && a.get(x).size() > y){
                  System.out.println(a.get(x).get(y));
              }
              else{
                  System.out.println("ERROR!");
              }
         }
    }
}
