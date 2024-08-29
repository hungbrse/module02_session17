package module02_session17;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr =new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        if(arr.length==0){
            throw  new RuntimeException("mảng rỗng ");
        }else  {
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("max"+max);
        }


    }
}
