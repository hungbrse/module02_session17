package module02_session17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần chuyển đổi: ");
        String inputString = scanner.nextLine();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(inputString.charAt(i)));
                integerList.add(number);
            }catch (Exception e) {
                 integerList.add(0);
                System.out.println("Ký tự '" + inputString.charAt(i) + "' không phải số nguyên, đã thay thế bằng 0.");

            }
        }

        System.out.println(integerList);
    }
}
