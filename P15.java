class P15 {
    public static void main(String args[]) {
        int num = 5;
        long fact = 1;

        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}