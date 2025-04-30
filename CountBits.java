public class CountBits {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;

        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1];
            if ((i & 1) == 1) {
                res[i] = res[i] + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        CountBits obj = new CountBits();
        int n = 5;
        int[] result = obj.countBits(n);
        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}

