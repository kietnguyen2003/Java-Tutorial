// Tính S(n) = 1 + 2 + 3 + 4 + ... + n
package Section;

public class ForWhileDoWhile {
  public static void main(String[] args) {
    // For
    int n = 10;
    int sum1 = 0;
    for(int i = 0; i < n; i ++ ){
      sum1 += i + 1;
    }
    System.out.println("Dùng For: " + sum1);

    // While
    int sum2 = 0;
    int index = 0;
    while(index < n){
      sum2 += index + 1;
      index++;
    }
    System.out.println("Dùng While: " + sum2);

    // Do-While
    int sum3 = 0;
    int index2 = 0;
    do{
      sum3 += index2 + 1;
      index2++;
    }while(index2 < n);
    System.out.println("Dùng Do-While: " + sum3);
  }
}

