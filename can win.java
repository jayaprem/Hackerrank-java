import java.util.*;

public class Solution {

    public static boolean canWin(int m, int[] arr,int i) {
        //int i=0;
       if (i < 0 || arr[i] == 1) return false;
    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

    arr[i] = 1;
    return canWin(m, arr, i + 1) || canWin(m, arr, i - 1) || canWin(m, arr, i + m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int j=0;
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,j)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
