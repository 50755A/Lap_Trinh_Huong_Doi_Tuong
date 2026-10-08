import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    do {
      System.out.print("Nhap bac n: ");
      n = scanner.nextInt();
    } while (n < 1);

    int[] arr = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      System.out.print("Nhap he so a[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }

    int x;
    System.out.print("Nhap gia tri x: ");
    x = scanner.nextInt();

    // f(x) = a[i=0] * x ^ n=0, i++, n++

    // arr[] = {2, 3, 1}
    // x = 2
    // n = 2

    // 2.x^0 + 3.x^1 + 1.x^2, n#, arr[#]

    double result = 0;
    for (int i = 0; i <= n; i++) {
      result += arr[i] * Math.pow(x, i);
    }

    // System.out.printf("f(%d) = %.2f%n", x, result); // f(2) = 12.00

    // f(2) = 1*2^2 + 3*2^1 + 2*2^0
    System.out.printf("f(%d) = ", x);
    for (int i = n; i >= 0; i--) {
      System.out.print(arr[i] + "*" + x + "^" + i);
      if (i > 0) {
        System.out.print(" + ");
      }
    }
    System.out.println();

    scanner.close();
    // printf: format output
    // %[flag][width][.precision][specifier-character]
    // [flag]: + , ( space
    // [width]: zero %04d, number %4d add space, negative number
    
    // %d: byte, short, int, long
    // %f: float, double
    // %s: String
    // %c: char
    // %b
    // %n, \n: new line
    // %%: %
    // %e: 1.234560e+03
    // %x: hexa
    // Numpad, Alt + 0178 = ²
  }
}
