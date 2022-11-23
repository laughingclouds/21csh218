import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class exp1_3 {
  static String count(ArrayList people) {
    int a = 0, b = 0, c = 0;

    for (Object person : people) {
      if (person instanceof Student) a++;
      if (person instanceof Rockstar) b++;
      if (person instanceof Hacker) c++;
    }

    return String.format("%d %d %d", a, b, c);
  }

  public static void main(String[] args) {

    ArrayList people = new ArrayList();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    sc.nextLine();

    while (t > 0) {
      String s = sc.next();
      
      if (s.equals("Student")) people.add(new Student());
      if (s.equals("Rockstar")) people.add(new Rockstar());
      if (s.equals("Hacker")) people.add(new Hacker());

      t--;
    }

    System.out.println(count(people));
    sc.close();
  }
}
