public class JavaWhileLoop {
    /*

     Loops

    Loops can execute a block of code as long as a specified condition is reached.

    Loops are handy because they save time, reduce errors, and they make code more readable.

    1, Java While Loop

    The while loop loops through a block of code as long as a specified condition is true:

     Syntax

        while (condition) {
          // code block to be executed
        }

        e.g
               int i = 0;
            while (i < 5) {
              System.out.println(i);
              i++;
            }

            output  0
                    1
                    2
                    3
                    4

        2, The Do/While Loop
        The do/while loop is a variant of the while loop. This loop will execute the code block once,
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        ** note, do/while loop. The loop will always be executed at least once, even if the condition is false,
                  because the code block is executed before the condition is tested:

        syntax

                do {
          // code block to be executed
        }
        while (condition);

        e.g
                    public class Main {
              public static void main(String[] args) {
                int i = 0;
                do {
                  System.out.println(i);
                  i++;
                }
                while (i < 5);
              }
            }

            output, 0
                    1
                    2
                    3
                    4


     */
}
