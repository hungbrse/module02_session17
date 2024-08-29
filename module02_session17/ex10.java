package module02_session17;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius ;
        double area;

        while (true) {
            System.out.println("nhập radius");
            try {
                radius = Double.parseDouble(sc.nextLine());
                if (radius < 0) {
                    throw new IllegalAccessException("radius phải lớn hơn 0");
                }else  {
                     area = Math.PI * radius * radius;
                    break;
                }
            }catch (IllegalAccessException e) {
                   System.out.println(e.getMessage());
            }
        }

        System.out.println("area la " + area);

    }
}
