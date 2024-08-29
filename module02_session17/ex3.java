package module02_session17;

public class ex3 {
    public static void main(String[] args) {


        Object[] array = {1,2,"a",4,"b",5};

         int sum = 0;

         for (int i = 0; i < array.length; i++) {
             try {
                 int number = (int) array[i];
                 sum += number;
             }catch (Exception e) {
                 System.out.println("Lỗi: Phần tử không phải là số nguyên - " + array[i]);
             }
         }

        System.out.println("Tổng của mảng: " + sum);

    }
}
