package Exercise;

public class LengthofLastWord {
  public static void main(String[] args) {
    String s = "Hello World";
    int l = s.length();
    int count = 0;
    for (int i = l - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ' && count == 0) {
        continue;
      } else if (s.charAt(i) == ' ') {
        break;
      } else {
        count++;
      }
    }
    System.out.println(count);
  }
}
