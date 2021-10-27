package module2.bai1_introductionjava.baitap;

import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD cần đổi: ");
        usd = scanner.nextInt();
        int swap = usd * vnd;
        System.out.print("Số USD chuyển được sang VND là: " + swap + "VND");
    }
}
