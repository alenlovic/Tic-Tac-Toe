// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    // put your code here

    Scanner scanner = new Scanner(System.in);

    int value;

    do {
      value = scanner.nextInt();
      System.out.println(value);
    } while (value != 0);
  }
}
