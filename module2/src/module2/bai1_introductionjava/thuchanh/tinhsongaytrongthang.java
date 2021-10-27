package module2.bai1_introductionjava.thuchanh;

import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tháng muốn kiểm tra: ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                daysInMonth = "Tháng có 31 ngày";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                daysInMonth = "Tháng có 30 ngày";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "") {
            System.out.printf("Tháng %d có %s ngày", month, daysInMonth);
        } else {
            System.out.print("Bạn đã nhập sai");
        }
    }
}
