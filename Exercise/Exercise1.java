// Tính S(n) = 1 + 2 + 3 + 4 + ... + n
package Exercise;

import java.util.Scanner;

public class Exercise1 {
  public static int S(int n) {
    if (n == 1) {
      return 1;
    }
    return n + S(n-1);
  }

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in);) {
      int n;
      do {
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        System.out.println("Sum: " + S(n));
      } while (n > 3 && n < 50);
    }

  }
}
