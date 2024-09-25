package Section;

public class FormatToPrint {
  public static void main(String []args){
    Integer studentID= 0212055;
    String studentName = "Nguyen Gia Kiet";
    Double score = 9.5;
    // String plus
    System.out.println(studentID + " - " + studentName + ": " + score);
    // Format to output
    String str = String.format("%s - %s: %f", studentID, studentName, score);
    System.out.println(str);
  }
}
