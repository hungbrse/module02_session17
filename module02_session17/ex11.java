package module02_session17;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int month = scanner.nextInt();

            System.out.print("Nhập ngày: ");
            int day = scanner.nextInt();

            validateDate(day, month, year);
            System.out.println("Ngày tháng năm hợp lệ.");
        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu. Vui lòng nhập lại số nguyên.");
        }
    }

    public static void validateDate(int day, int month, int year) throws InvalidDateException {
        if (year <= 0) {
            throw new InvalidDateException("Năm phải lớn hơn 0.");
        }
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Tháng phải nằm trong khoảng từ 1 đến 12.");
        }

        int maxDaysInMonth = getMaxDaysInMonth(month, year);
        if (day < 1 || day > maxDaysInMonth) {
            throw new InvalidDateException("Ngày không hợp lệ trong tháng " + month + ".");
        }
    }

    private static int getMaxDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return (isLeapYear(year) ? 29 : 28);
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}
