public class JavaMethodsOverloading {
    /*

    Java Method Overloading

    Method Overloading

        With method overloading, multiple methods can have the same name with different parameters:

        Example
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)

        e.g
            public class Main {
          static int plusMethodInt(int x, int y) {
            return x + y;
          }

          static double plusMethodDouble(double x, double y) {
            return x + y;
          }

          public static void main(String[] args) {
            int myNum1 = plusMethodInt(8, 5);
            double myNum2 = plusMethodDouble(4.3, 6.26);
            System.out.println("int: " + myNum1);
            System.out.println("double: " + myNum2);
          }
        }

        ** So Instead of defining two methods that should do the same thing, it is better to overload one.

            Inorder to avoid redundancy

            In the example below, we overload the plusMethod method to work for both int and double:

            e.g
                        public class Main {
                  static int plusMethod(int x, int y) {
                    return x + y;
                  }

                  static double plusMethod(double x, double y) {
                    return x + y;
                  }

                  public static void main(String[] args) {
                    int myNum1 = plusMethod(8, 5);
                    double myNum2 = plusMethod(4.3, 6.26);
                    System.out.println("int: " + myNum1);
                    System.out.println("double: " + myNum2);
                  }
                }

             ** Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

    */
}
