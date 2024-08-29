package module02_session17;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cần tìm kiếm: ");
        int target = scanner.nextInt();

        Arrays.sort(array);
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Phần tử không được tìm thấy trong mảng.");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target)
                return mid;

            if (array[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }
}
