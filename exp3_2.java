import java.util.*;

public class exp3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 1;
    while (sc.hasNext()) {
      System.out.printf("%d %s\n", i, sc.nextLine());
      i++;
    }
    sc.close();
  }
}