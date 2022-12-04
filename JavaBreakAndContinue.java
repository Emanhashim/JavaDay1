public class JavaBreakAndContinue {
    /*
    1, Java Break, here it break entire execution after reaching to that code

    break in switch and loop statement it works to break the execution

    You have already seen the break statement used in an earlier chapter of this tutorial.
    It was used to "jump out" of a switch statement.

    The break statement can also be used to jump out of a loop.
    e.g
                public class Main {
              public static void main(String[] args) {
                for (int i = 0; i < 10; i++) {
                  if (i == 4) {
                    break;
                  }
                  System.out.println(i);
                }
              }
            }

            output  0
                    1
                    2
                    3

    2, Java Continue, this is break the specific iteration n continue with the execution

        The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        and continues with the next iteration in the loop.

        This example skips the value of 4:

        e.g
                    public class Main {
              public static void main(String[] args) {
                for (int i = 0; i < 10; i++) {
                  if (i == 4) {
                    continue;
                  }
                  System.out.println(i);
                }
              }
            }   output, 0
                        1
                        2
                        3
                        5
                        6
                        7
                        8
                        9

        3, Break and Continue in While Loop
    You can also use break and continue in while loops:

    e.g for break
            public class Main {
          public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
              System.out.println(i);
              i++;
              if (i == 4) {
                break;
              }
            }
          }
        }

        output,
        0
        1
        2
        3

        e.g for continue

                public class Main {
          public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
              if (i == 4) {
                i++;
                continue;
              }
              System.out.println(i);
              i++;
            }
          }
        }   output,
public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      if (i == 4) {
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      if (i == 4) {
        i++;
        continue;
      }
      System.out.println(i);
      i++;
    }
  }
}    output
            0
            1
            2
            3
            5
            6
            7
            8
            9


    */
}
