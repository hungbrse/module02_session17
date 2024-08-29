package module02_session17;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);

        String str ;

        String newStr = "";

        try {
            str = sc.nextLine();
            if (str.trim().isEmpty()) {
                throw  new IllegalAccessException(" chuỗi rỗng ");
            } else {

                newStr = new StringBuilder(str).reverse().toString();
            }
        }catch (IllegalAccessException e){
            System.out.println("Lỗi: " + e.getMessage());
        }
        System.out.println(newStr);
    }
}
