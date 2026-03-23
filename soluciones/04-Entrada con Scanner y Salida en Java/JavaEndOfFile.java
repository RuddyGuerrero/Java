import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int con = 0;
      while (scanner.hasNext()){
          
          con = con + 1;
          String s = String.valueOf(con) + " " + scanner.nextLine();
          System.out.println(s);
      }
    }
}
