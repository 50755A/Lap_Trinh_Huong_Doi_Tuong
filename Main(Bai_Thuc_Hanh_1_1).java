import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // import java.util.Random;
    // Random random = new Random();
    // int number = random.nextInt(1,101);

    // double number = Math.random(); // [0.0, 1.0)
    // int number = (int)(Math.random() * n); // [0, n-1]
    // int number = (int)(Math.random() * (max-min+1)) + min; // [min, max]
    // double number = Math.random() * (max-min) + min; // [min, max)
    // boolean guess = Math.random() < 0.5; // [0.0, 0.5)

    Scanner scanner = new Scanner(System.in);

    final int MIN = 1;
    final int MAX = 100;

    int number = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

    int guess;
    do {
      System.out.print("Nhap du doan cua ban [" + MIN + ", " + MAX + "]: ");
      guess = scanner.nextInt();

      if (guess < MIN || guess > MAX) {
        System.out.println("Vui long nhap so nguyen tu " + MIN + " den " + MAX + "!");
      }
    } while (guess < MIN || guess > MAX);

    if (guess > number) {
      System.out.print("Ban da doan so lon hon!");
    } else if (guess < number) {
      System.out.print("Ban da doan so nho hon!");
    } else {
      System.out.print("Ban da doan dung!");
    }

    System.out.println(" (" + number + ")");

    scanner.close();
  }
}
