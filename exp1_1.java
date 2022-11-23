// using java 15
// print table of number entered
import java.util.*;

public class exp1_1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();
        
        scanner.close();
        
        for (var i = 1; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", n, i, n * i);
    }
}
