package module02_session17;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 ,n2;


        while (true) {
            try {
                n1 = Integer.parseInt(sc.nextLine());
                n2 = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e) {
                System.out.println(" n1 hoặc n2 không phải số ");
            }
        }

        if (n1 > n2) {
            System.out.println("so lon nhat la" + n1);
        }else {
            System.out.println("so lon nhat la" + n2);
        }
    }
}
