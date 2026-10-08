import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s;

    System.out.print("Enter your string: ");
    s = scanner.nextLine();

    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isUpperCase(c))
        count++;
    }

    System.out.printf("Uppercase letter(s): %d", count);

    scanner.close();
  }
}