// S(n) = 1 + 1/2 + 1/3 + ... + 1/n
package Day1.Exercise;

import java.util.Scanner;

public class Exercise3 {
  public static float S(int n) {
    System.out.println("1/" + n);
    if (n == 1)
      return (float) 1 / n;
    return (float) 1 / n + S(n - 1);
  }

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int n;
      do {
        System.out.println("Enter a number for S(n): ");
        n = Integer.parseInt(scan.nextLine());
      } while (n >= 7);
      System.out.println("Sum: " + S(n));
    }
  }
}
