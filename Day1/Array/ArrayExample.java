package Day1.Array;

public class ArrayExample {
  public static void main(String[] args) {
    // Khai báo và khởi tạo một mảng gồm 5 phần tử kiểu int
    int[] numbers = new int[5];

    // Gán giá trị cho các phần tử trong mảng
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // In ra các phần tử của mảng
    System.out.println("Array elements:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Element at index " + i + ": " + numbers[i]);
    }
  }
}
