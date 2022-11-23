import java.util.Scanner;

public class exp1_4 {
  static String strRev(String str) {
    String newStr = "";

    for (int i = str.length() - 1; i > -1; i--)
      newStr += str.charAt(i);
    return newStr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Is pallindrome?");
    System.out.print("Enter any string: ");

    String strInput = sc.nextLine();

    String revStrInput = strRev(strInput);

    if (strInput.equals(revStrInput))
      System.out.println("Yes");
    else
      System.out.println("No");

    sc.close();
  }
}