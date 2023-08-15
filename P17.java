class P17 {
    public static void main(String args[]) {
        int num = 5;
        int a = 0, b = 1, c;

        System.out.print("Fibonacci series for " + num + " terms : ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}