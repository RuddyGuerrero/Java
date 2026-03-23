import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 1; i <= s.length()-k; ++i){
             String tem = s.substring(i, i+k);
             if (smallest.compareTo(tem) > 0) 
                 smallest = tem;
             if (largest.compareTo(tem) < 0) 
                 largest = tem;    
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}