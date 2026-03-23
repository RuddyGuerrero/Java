import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        int n = game.length;
        Queue<Integer> cola = new LinkedList<>();
        cola.add(0);
        game[0] = 1;
        while (!cola.isEmpty()){
            int pos = cola.poll();
            if (pos + leap >= n || pos + 1 >= n)
                return true;
            if (pos+1 < n && game[pos+1] == 0){
                game[pos+1] = 1;
                cola.add(pos+1);
            }
            if (pos-1 >= 0 && game[pos-1] == 0){
                game[pos-1] = 1;
                cola.add(pos-1);
            }
            if (pos+leap < n && game[pos+leap] == 0){
                game[pos+leap] = 1;
                cola.add(pos+leap);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
