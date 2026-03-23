import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; ++i){
             int ele = sc.nextInt();
             a.add(ele);
        }

        int q = sc.nextInt();
        while (q-- > 0){
            String op = sc.next();
            int pos = sc.nextInt();
            if (op.equals("Insert")){
                int ele = sc.nextInt();
                a.add(pos, ele);
            }
            else{
                a.remove(pos);
            }
        }

        for (Integer ele : a)
            System.out.print(ele + " ");
    }
}