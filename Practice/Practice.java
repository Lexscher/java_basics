package Practice;

public class Practice {
  public static void main(String[] args) {
    String movie = "The Dark Knight";

    char d = movie.charAt(4);

    System.out.println(d + " is the first letter in the second word of " + movie);

    boolean noble = movie.contains("Knight");

    if (noble) {
      System.out.println("We love " + movie);
    } else {
      System.out.println(movie + " wasn't even that good...");
    }

    if (Math.abs("g".compareTo("n")) > Math.abs("g".compareTo("c"))) {
      System.out.println("The difference between \"g\" and \"n\", " + Math.abs("g".compareTo("n"))
          + " is greater than that of \"g\" and \"c\", which is " + Math.abs("g".compareTo("c")) + ".");
    } else {
      System.out.println("The difference between \"g\" and \"n\", " + Math.abs("g".compareTo("n"))
          + " is less than that of \"g\" and \"c\", which is " + Math.abs("g".compareTo("c")) + ".");
    }

  }
}

/* PRIMITIVE TYPES & CASTING */
// int num1 = 5; int num2 = 3; double quotient = (double) num1 / (double) num2;
//
// System.out.println("The quotient of " + num1 + " and " + num2 + " is " +
// quotient + ".");
//

/* Scanner for User Input */
// Scanner sc = new Scanner(System.in);

// System.out.print("What is your name? ");
// String name = sc.nextLine();
// sc.close();

// System.out.println("Nice to meet you, " + name);