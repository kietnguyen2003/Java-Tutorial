// S(n) = 1/2 + 1/4 + ... + 1/2n

package Day1.Exercise;

import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    int n;
    try (Scanner scan = new Scanner(System.in)) {
      do {
        System.out.println("Enter a number for S(n): ");
        n = Integer.parseInt(scan.nextLine());
      } while (n < 9);
      float sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += (float) 1 / (2 * i);
      }
      System.out.println("Sum: " + sum);
    }
  }
}
