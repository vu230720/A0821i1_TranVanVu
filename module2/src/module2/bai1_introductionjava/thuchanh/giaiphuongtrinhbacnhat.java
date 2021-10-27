package module2.bai1_introductionjava.thuchanh;

import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else if (b == c) {
            System.out.print("The solution is all x!");
        }else {
            System.out.print("No solution!");
        }
    }
}
