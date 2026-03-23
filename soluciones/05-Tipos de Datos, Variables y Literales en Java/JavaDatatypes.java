import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh){

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // leemos el fin de linea
        for (int i = 0; i < n; i++){
            String result = "";
            if (scanner.hasNextByte())
                result += "\n* byte";
            if (scanner.hasNextShort())
                result += "\n* short";
            if (scanner.hasNextInt())
                result += "\n* int";
            if (scanner.hasNextLong())
                result += "\n* long";
                
            if (result.length() > 0)
                result = scanner.nextLine() + " can be fitted in:" + result;
            else
                result = scanner.nextLine() + " can't be fitted anywhere.";
                
            System.out.println(result);
        }
    }
}