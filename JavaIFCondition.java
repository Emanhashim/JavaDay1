public class JavaIFCondition {

    /*

    Java Conditions and If Statements
You already know that Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

    1, The if Statement

    Use the if statement to specify a block of Java code to be executed if a condition is true.

    syntax
    if (condition) {
  // block of code to be executed if the condition is true
}

        e.g     int x = 20;
                int y = 18;
                if (x > y) {
                  System.out.println("x is greater than y");
                }

                his example only print the output as long as x is gr8 than y, if not it  wont show anything

      2, The else Statement

    Use the else statement to specify a block of code to be executed if the condition is false.

    syntax
            if (condition) {
          // block of code to be executed if the condition is true
        } else {
          // block of code to be executed if the condition is false
        }

      e.g            int time = 20;
                    if (time < 18) {
                      System.out.println("Good day.");
                    } else {
                      System.out.println("Good evening.");
                    }
                    // Outputs "Good evening."

                    ** in else there is no condition to be checked it prints if the above condition isn't true we use it to print the false output

       3, The else if Statement

    Use the else if statement to specify a new condition if the first condition is false.

    syntax
                if (condition1) {
              // block of code to be executed if condition1 is true
            } else if (condition2) {
              // block of code to be executed if the condition1 is false and condition2 is true
            } else {
              // block of code to be executed if the condition1 is false and condition2 is false
            }

            e.g                 int time = 22;
                                if (time < 10) {
                                  System.out.println("Good morning.");
                                } else if (time < 18) {
                                  System.out.println("Good day.");
                                } else {
                                  System.out.println("Good evening.");
                                }
                                // Outputs "Good evening."


            4, Java Short Hand If...Else (Ternary Operator)

            Short Hand If...Else

    There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

    It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

    syntax
    variable = (condition) ? expressionTrue :  expressionFalse;

    e.g,    int time = 20;
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);



     */


}
