class P24 {
    public static void main(String args[]) {
        int n = 3553, rev = 0, digit, orgn;
        orgn = n;

        while (orgn != 0) {
            digit = orgn % 10;
            rev = rev * 10 + digit;
            orgn /= 10;
        }

        if (n == rev)
            System.out.println(n + " is palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }
}