class P6 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        swap1(a, b);
        swap2(a, b);
    }

    static void swap2(int a, int b) {
        System.out.println("Before swapping");
        System.out.println("A = " + a + " B = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After swapping");
        System.out.println("A = " + a + " B = " + b);
    }

    static void swap1(int a, int b) {
        System.out.println("Before swapping");
        System.out.println("A = " + a + " B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("A = " + a + " B = " + b);
    }
}