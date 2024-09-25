package Section;

public class Function {
  public static int Sum(int n){
    int sum = 0;
    for(int i = 0; i < n; i ++ ){
      sum += i + 1;
    }
    return sum;
  }

  public static void main(String []args){
    int n = 10;
    System.out.println("Tong tu 1 den n: " + Sum(n));
  }
}
