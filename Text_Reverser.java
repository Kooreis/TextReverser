```java
import java.util.Scanner;

public class TextReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse:");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed text: " + reversed);
    }
}
```