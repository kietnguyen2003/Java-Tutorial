package Section;

public class ConvertToString {
  public static void main(String[] args) {

    // Convert int to String
    int num = 10;
    String str = String.valueOf(num);
    System.out.println("String of Int: " + str);

    // Convert double to String
    double num1 = 10.5;
    String str1 = String.valueOf(num1);
    System.out.println("String of Double: " + str1);

    // Convert char to String
    char ch = 'A';
    String str2 = String.valueOf(ch);
    System.out.println("String of Char: " + str2);

    // Convert boolean to String
    boolean bool = true;
    String str3 = String.valueOf(bool);
    System.out.println("String of Boolean: " + str3);

    // Convert char array to String
    char[] chArr = { 'A', 'B', 'C', 'D' };
    String str4 = String.valueOf(chArr);
    System.out.println("String of Char Array: " + str4);

    // Convert Object to String
    Object obj = new Object();
    String str5 = String.valueOf(obj);
    System.out.println("String of Object: " + str5);

    // Convert array number to String
    int[] numArr = new int[] { 1, 2, 3, 4 };
    String str6 = String.valueOf(numArr);
    System.out.println("String of Number Array: " + str6);

    // Convert char array to String with offset and count
    char[] chArr1 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
    String str7 = String.valueOf(chArr1, 2, 3);
    System.out.println("String of Char Array with offset and count: " + str7);
  }
}
