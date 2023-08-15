class P22 {
    public static void main(String args[]) {
        int n = 1234, rev = 0, digit, orgn;
        orgn = n;

        while (orgn != 0) {
            digit = orgn % 10;
            rev = rev * 10 + digit;
            orgn /= 10;
        }

        System.out.println("Reverse of " + n + " is " + rev);
    }
}