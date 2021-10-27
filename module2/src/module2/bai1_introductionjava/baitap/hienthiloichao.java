package module2.bai1_introductionjava.baitap;

import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello "+ name);
    }
}
