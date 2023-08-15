class P28 {
    public static void main(String args[]) {
        int n1 = 999, n2 = 99999;
        for (int n = n1; n <= n2; n++) {
            int orgn = n, digit, result = 0, count = 0;

            while (orgn != 0) {
                orgn /= 10;
                count++;
            }

            orgn = n;

            while (orgn != 0) {
                digit = orgn % 10;
                result = result + (int) Math.pow(digit, count);
                orgn /= 10;
            }

            if (result == n)
                System.out.print(n + " ");
        }
    }
}