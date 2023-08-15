class P21 {
    public static void main(String args[]) {
        int n = 1000, count = 0, n1;
        n1 = n;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digit in " + n1 + " is " + count);
    }
}