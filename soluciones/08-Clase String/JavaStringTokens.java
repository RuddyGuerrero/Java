import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim();
        String regex = "[ !,?._'@]+";;
        String[] array = s.split(regex);
        
        if (s.isEmpty()) 
            System.out.println(0);
        else{
            System.out.println(array.length);
            for (String e : array) 
                System.out.println(e);
        }
        
        scan.close();
    }
}