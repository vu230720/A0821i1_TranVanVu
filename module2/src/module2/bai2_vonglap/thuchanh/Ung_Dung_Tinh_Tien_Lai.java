package module2.bai2_vonglap.thuchanh;

import java.util.Scanner;

public class Ung_Dung_Tinh_Tien_Lai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amoumnt: ");
        double money;
        int month;
        double interset_rate;
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter anual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i=0; i< month; i++){
            total_interest += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total of interest: "+total_interest);
    }
}
