package module02_session17;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lương phần tử cho mảng ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int trungBinh = 0;

     try {
         if (arr.length == 0) {
             throw new IllegalAccessException("mảng rỗng");
         } else {
             for (int i = 0; i < arr.length; i++) {
                 System.out.println("nhập phần tử thứ " + arr[i]);
                 arr[i] = sc.nextInt();
                 trungBinh = trungBinh + arr[i];
             }
         }

     }catch (IllegalAccessException e) {
         e.printStackTrace();
     }

        System.out.println(trungBinh/arr.length);


    }
}
