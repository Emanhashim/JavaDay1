public class JavaForLoop {
    /*
    1, Java For Loop

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        Syntax

        for (statement 1; statement 2; statement 3) {
          // code block to be executed
        }

            Statement 1 is executed (one time) before the execution of the code block.

            Statement 2 defines the condition for executing the code block.

            Statement 3 is executed (every time) after the code block has been executed.

        e.g
                    public class Main {
              public static void main(String[] args) {
                for (int i = 0; i < 5; i++) {
                  Syst
                  em.out.println(i);
                }
              }
            }  output, 0,1,2,3,4

            e.g two, print even numbers
            public static void main(String[] args) {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }

**  note that the execution steps are
1, initial value
2, value stop
3, line of code to be executed
4, condition like (i++, i--, i+2 ...)


     2, Nested Loops

        It is also possible to place a loop inside another loop. This is called a nested loop.

        The "inner loop" will be executed one time for each iteration of the "outer loop":

     e.g
                 public class Main {
              public static void main(String[] args) {
                // Outer loop.
                for (int i = 1; i <= 2; i++) {
                  System.out.println("Outer: " + i); // Executes 2 times

                  // Inner loop
                  for (int j = 1; j <= 3; j++) {
                    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
                  }
                }
              }
            }

                         */


public static void main(String [] args){

    for (int i = 1; i<= 2; i++){
        System.out.println("this from outer" + i);

        for(int j = 1;  j<=2; j++){
            System.out.println("this from inner" + j);
        }


    }

}

}


