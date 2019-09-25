package Practice;
import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("What is your name? ");
    String name = sc.nextLine();
    sc.close();
    
    System.out.println("Nice to meet you, " + name);

    
  }
}

/* PRIMITIVE TYPES & CASTING */
// int num1 = 5; int num2 = 3; double product = (double) num1 / (double) num2;
//
// System.out.println("The product of " + num1 + " and " + num2 + " is " +
// product + ".");
//