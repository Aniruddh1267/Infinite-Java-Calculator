package Calculator;

import java.util.Scanner;

public class calculator {

  public static void main(String[] args) {
    int number;
    int sum = 0;
    String symbol;
    Scanner scan = new Scanner(System.in);

    sum = scan.nextInt();

    while (true) {

      symbol = scan.next();
      if (symbol.equals("+")) {

        number = scan.nextInt();
        sum = sum + number;
        System.out.println(sum);
      }
      if (symbol.equals("-")) {

        number = scan.nextInt();
        sum = sum - number;
        System.out.println(sum);
      }
      if (symbol.equals("*")) {

        number = scan.nextInt();
        sum = sum * number;
        System.out.println(sum);
      }
      if (symbol.equals("/")) {

        number = scan.nextInt();
        sum = sum / number;
        System.out.println(sum);
      }
    }
  }
}
