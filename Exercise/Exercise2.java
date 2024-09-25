// Tính S(n) = 1^2 + 2^2 + 3^2 + ... + n^2

package Exercise;

import java.util.Scanner;

public class Exercise2 {
  public static int S(int n) {
    if (n == 1) {
      return 1;
    } 
    return n * n + S(n - 1);
  }

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int n;
      do{
        System.out.print("Enter a number for S(n): ");
        n = scan.nextInt();
      }while( n >= 5 && n <= 20);
      System.out.println("Sum: " + S(n));
    }
  }
}
