package Section;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int m = 0;
      System.out.print("Enter m: ");
      m = scan.nextInt();

      int n = 0;
      System.out.print("Enter n: ");
      n = scan.nextInt();

      if (m > n) {
        System.out.print("m > n");
      } else if (m < n) {
        System.out.print("m < n");
      } else {
        System.out.print("m = n");
      }
    }
  }
}
