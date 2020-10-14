package recursion.n_bit_binary_print;

public class Solution {

    static int n = 5;

    public static void main(String[] args) {

        solve(0, 0, "");
    }

    public static void solve(int ones, int zeros, String output) {

        if (ones + zeros == n) {
            System.out.println(output);
            return;
        }
        solve(ones, zeros + 1, output + "0");
        solve(ones + 1, zeros, output + "1");

    }
}
