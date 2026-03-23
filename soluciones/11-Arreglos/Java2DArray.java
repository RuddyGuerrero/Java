import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int [][]arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = scan.nextInt();
                arr[i][j] = arrItem;
            }
        }
        
        int sol = -10*7;
        for (int i = 1; i < 5; ++i){
            for (int j= 1; j < 5; ++j){
                 sol = Math.max(sol, arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
            }
        }
        
        System.out.println(sol);

        scan.close();
    }
}