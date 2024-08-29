package module02_session17;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
         int n1 , n2;
         Scanner sc = new Scanner(System.in);

         while (true){


             try {
                 System.out.println("nhập số thứ 1 :");
                 n1 = Integer.parseInt(sc.nextLine());
                 break;
             }catch (NumberFormatException e){
                 System.out.println("nhập giá trị không đúng ");
             }




         }

         while (true){
             try {
                 System.out.println("nhập số thứ 2 :");
                 n2 = Integer.parseInt(sc.nextLine());
                 break;
             }catch (NumberFormatException e){
                 System.out.println("nhập giá trị không đúng ");
             }
         }

         int sum = n1 + n2;
         System.out.println(sum);
    }
}
