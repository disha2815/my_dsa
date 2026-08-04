import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class pgm1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int n = sc.nextInt();
            int[] N = new int[n];
            for(int i = 0; i < N.length; i++) {
                N[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int[] ans = twoSum(N, target);
            System.out.println(ans[0] + " " + ans[1]);
        }

    }
    public static int[] twoSum(int[] N, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N.length; i++) {
            if(map.containsKey(target - N[i])) {
                return new int[]{(target - N[i]), i};
            }
            map.put(N[i], i);
        }
        return new int[]{-1,-1};
    }
}
