class P19 {
    public static void main(String args[]) {
        int n1 = 72, n2 = 120;
        int gcd = 1, lcm;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (n1 * n2) / gcd;
        System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm);
    }
}