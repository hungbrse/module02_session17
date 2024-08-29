package module02_session17;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;

        int ketQua = 0;
        n1 = Integer.parseInt(sc.nextLine());
        n2 = Integer.parseInt(sc.nextLine());
        try {
            ketQua = n1 / n2;

        }catch (ArithmeticException e){
            System.out.println("1 trong 2 số không hợp lệ ");
        }

        System.out.println(ketQua);
    }
}
