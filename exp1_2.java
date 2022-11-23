// Java 17
abstract class Book {
  protected String name;
  public abstract void setTitle(String title);
}
class MyBook extends Book {
  MyBook(String name) {
    this.name = name;
  }
  public void setTitle(String name) {
    this.name = name;
    System.out.printf("Book title set to \'%s\'\n", name);
  }
}
public class exp1_2 {
  public static void main(String[] args) {
    MyBook book = new MyBook("Alice in Wonderland");
    book.setTitle("Charlie and the Chocolate Factory");
  }
}

