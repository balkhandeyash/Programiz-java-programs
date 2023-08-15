class P26 {
    public static void main(String args[]) {
        int n1 = 20, n2 = 50;
        for (int n = n1; n <= n2; n++) {
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(n + " ");
        }
    }
}