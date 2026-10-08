import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int number;
    number = random.nextInt(1,101);

    int guess;
    System.out.print("Nhap du doan cua ban [1-100]: ");
    guess = scanner.nextInt();

    if(guess==number) {
      System.out.print("Ban da doan dung!");
    }
    else if(guess>number) {
      System.out.print("Ban da doan so lon hon!");
    }
    else {
      System.out.print("Ban da doan so nho hon!");
    }

    System.out.println(" (" + number + ")");
  }
}