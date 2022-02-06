package Calculator;

import java.util.Scanner;

public class calculator{

  public static void main(String[] args) {
    int number;
    int sum = 0;
    String symbol;
    Scanner scan = new Scanner(System.in);
    System.out.print("enter number:");
    sum = scan.nextInt();

    while (true) {
   
      System.out.print("enter symbol:");
      symbol = scan.next();
      if (symbol.equals("+")) {
        System.out.print("enter number:");
        number = scan.nextInt();
        sum = sum + number;
        System.out.println("answer is :" + sum + "\n\n");
      }
      if (symbol.equals("-")) {
        System.out.print("enter number:");
        number = scan.nextInt();
        sum = sum - number;
        System.out.println("answer is :" + sum + "\n\n");
      }
      if (symbol.equals("*")) {
        System.out.print("enter number:");
        number = scan.nextInt();
        sum = sum * number;
        System.out.println("answer is :" + sum + "\n\n");
      }
      if (symbol.equals("/")) {
        System.out.print("enter number:");
        number = scan.nextInt();
        sum = sum / number;
        System.out.println("answer is :" + sum + "\n\n");
      }
    }
  }
}
