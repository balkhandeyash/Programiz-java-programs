class P23 {
    public static void main(String args[]) {
        int digit = 3, power = 4, result;

        /*
         * for (int i = 0; i < power; i++) {
         * result *= digit;
         * }
         * System.out.println(result);
         */
        result = (int) Math.pow(digit, power);
        System.out.println(result);
    }
}