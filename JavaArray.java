public class JavaArray {
    /*

   1, Java Arrays

    Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    1.1, To declare an array, define the variable type with square brackets:
            String[] cars;
            Type[] name;

    1.2, We have now declared a variable that holds an array of strings.
         To insert values to it, you can place the values in a comma-separated list, inside curly braces:

         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    1.3, To create an array of integers, you could write:

         int[] myNum = {10, 20, 30, 40};

    2,  Access the Elements of an Array

        You can access an array element by referring to the index number.

        This statement accesses the value of the first element in cars:
        ** Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        e.g
                    public class Main {
              public static void main(String[] args) {
                String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                System.out.println(cars[0]);
              }
            }
            output, Volvo

     3, Change an Array Element

      To change the value of a specific element, refer to the index number:

      e.g cars[0] = "Opel";

      e.g,
              public class Main {
          public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            cars[0] = "Opel";
            System.out.println(cars[0]);
          }
        }
        output, Opel

    4, Array Length

    To find out how many elements an array has, use the length property:
    e.g,
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        // Outputs 4

    */
}
