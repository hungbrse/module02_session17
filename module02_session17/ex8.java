package module02_session17;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("nhập 1 số ");
            int n = Integer.parseInt(scanner.nextLine());

            if (n < 2) {
                throw new IllegalArgumentException("số nguyên tố  phải bắt đầu bằng ");
            }else  {
                boolean check = true;
                for (int i = 2; i<n; i++) {
                         if (n%i==0) {
                             check = false;
                         }
                }
                if (check) {
                    System.out.println(n + "là số nguyên tố :");
                } else  {
                    System.out.println(n + "không phải là số  nguyên tố :");
                }
            }

        }catch (Exception e) {
            System.out.println("dữ liệu nhập không hợp lệ ");
        }

    }
}
