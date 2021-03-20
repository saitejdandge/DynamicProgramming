package sliding_window.max_sub_arrays_k;

import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,3,2,1,12,1};
        solve(a, 3);
    }

    private static void solve(int[] a, int windowSize) {
        if (a == null || a.length == 0)
            return;

        int i = 0, j = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n, m) -> m - n);
        while (j < a.length) {
            maxHeap.add(a[j]);
            if (j - i + 1 >= windowSize) {
                System.out.print(maxHeap.peek() + " ");
                //remove info of a[i]
                maxHeap.remove(a[i]);
                i++;
            }
            j++;
        }
    }
}
