import java.util.Scanner;

class P3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float first = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float second = sc.nextFloat();
        float sum = first * second;
        System.out.println("Product of two numbers is " + sum);
    }
}