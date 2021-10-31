package module2.bai2_vonglap.baitap;

import java.util.Scanner;

public class Hien_Thi_Menu_Cac_Loai_Hinh {
    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at botton-left");
        System.out.println("3. Print the square triangle (The corner is square at top-left");
        System.out.println("4. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter the choice: ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int choice = 1;
        while (choice != 0) {
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the lenght: ");
                    int lenght = scanner.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scanner.nextInt();
                    for (int i = 0; i < width; i++){
                        System.out.println(" ");
                        for (int j = 0; j < lenght; j++){
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 2:
                    System.out.print("Enter the height: ");
                    int h = scanner.nextInt();
                    for (int i = 1; i <= h; i++){
                        System.out.println(" ");
                        for (int j = 1; j < i; j++){
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 3:
                    System.out.print("Enter the height: ");
                    int k = scanner.nextInt();
                    for (int i = k; i > 0; i--){
                        System.out.println(" ");
                        for (int j = 0; j < i; j++){
                            System.out.print(" * ");
                        }
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 4:
                    System.out.print("Enter the height: ");
                    int l = scanner.nextInt();
                    for (int i = 1; i <= l; i++){
                        for (int j = i; j <= l - 1;j++){
                            System.out.print("   ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    menu();
                    break;
                case 0:
                    System.out.print("Exit");
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    menu();
            }
        }
    }
}
