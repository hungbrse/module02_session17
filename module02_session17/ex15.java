package module02_session17;

import java.util.Scanner;

public class ex15  extends Exception{
    class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {

        ex15 ex15 = new ex15();
        Scanner sc = new Scanner(System.in);

        double side1, side2, side3;



        try {
            System.out.print("Nhập cạnh a: ");
            double a = sc.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = sc.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = sc.nextDouble();

            ex15.validateTriangle(a, b, c);
            System.out.println("Ba cạnh tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        }
    public  void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác không thể là số âm hoặc bằng 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng độ dài của hai cạnh bất kỳ phải lớn hơn cạnh còn lại.");
        }
    }

    
}
