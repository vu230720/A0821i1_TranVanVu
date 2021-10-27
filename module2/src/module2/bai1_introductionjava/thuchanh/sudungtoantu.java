package module2.bai1_introductionjava.thuchanh;

import java.util.Scanner;

public class sudungtoantu {
    public static void main(String[] args){
        float width;
        float height;

        Scanner ac = new Scanner(System.in);
        System.out.println("Nhập width: ");
        width = ac.nextFloat();
        System.out.println("Nhập height: ");
        height = ac.nextFloat();

        float area = width * height;
        System.out.println("area = " + area);
    }
}
