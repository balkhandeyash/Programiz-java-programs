class P27 {
    public static void main(String args[]) {
        int n = 371;
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
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}