public class JavaLoopThrougArray {
    /*

   1, Loop Through an Array

    You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

    The following example outputs all elements in the cars array:

    .length  this property used to show how many time our array should loop
    e.g
            public class Main {
          public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (int i = 0; i < cars.length; i++) {
              System.out.println(cars[i]);
            }
          }
        }

        output, Volvo
                BMW
                Ford
                Mazda

  2, Loop Through an Array with For-Each

    There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
    syntax
            for (type variable : arrayname) {
          ...
        }
   e.g
           public class Main {
          public static void main(String[] args) {
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
              System.out.println(i);
            }
          }
        }

        output, Volvo
                BMW
                Ford
                Mazda


     */
}
