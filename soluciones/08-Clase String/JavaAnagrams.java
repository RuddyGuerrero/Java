import java.util.Scanner;

public class Solution {

     static boolean isAnagram(String a, String b) {
       
       int [] fr = new int[27];
       a = a.toLowerCase();
       b = b.toLowerCase();
       
       for (int i = 0; i < a.length(); ++i){
            int pos = a.charAt(i) - 'a';
            fr[pos] ++;
       }
            
       for (int i = 0; i < b.length(); ++i){
            int pos = b.charAt(i) - 'a';
            fr[pos] --; 
       }
       
       for (int i= 0; i < 27; ++i)
            if (fr[i] != 0) 
                return false;
            
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}