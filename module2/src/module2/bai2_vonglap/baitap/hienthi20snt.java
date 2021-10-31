package module2.bai2_vonglap.baitap;

import java.util.Scanner;

public class hienthi20snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number){
            boolean check = true;
            for (int i=2; i<=Math.sqrt(number); i++){
                if (n%i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
    }
}
