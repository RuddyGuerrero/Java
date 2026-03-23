import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long tot = 0;
        for (Integer ele : arr)
            tot += ele;
        long menor = tot - arr.get(0);
        long mayor = tot - arr.get(0);
        for (int i = 1; i < arr.size(); i++){
             menor = (menor > tot - arr.get(i)) ? tot - arr.get(i) : menor;
             mayor = (mayor < tot - arr.get(i)) ? tot - arr.get(i) : mayor;
        }
        System.out.println(menor + " " + mayor);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
