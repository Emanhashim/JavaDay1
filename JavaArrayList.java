public class JavaArrayList {
    /*

    Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

e.g

Create an ArrayList object called cars that will store strings:

import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object


         1, Add Items

 The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:

    e.g
    import java.util.ArrayList;

    public class Main {
      public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
      }
    }

    output, [Volvo, BMW, Ford, Mazda]

          2, Access an Item
To access an element in the ArrayList, use the get() method and refer to the index number:

        e.g
               import java.util.ArrayList;

        public class Main {
          public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars.get(0));
          }
        }


        output, Volvo
        * Remember: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

           3, Change an Item
To modify an element, use the set() method and refer to the index number:
    e.g
                import java.util.ArrayList;

            public class Main {
              public static void main(String[] args) {
                ArrayList<String> cars = new ArrayList<String>();
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");
                cars.set(0, "Opel");
                System.out.println(cars);
              }
            }
            output, [Opel, BMW, Ford, Mazda]

             4, Remove an Item
To remove an element, use the remove() method and refer to the index number:

        e.g
        import java.util.ArrayList;

    public class Main {
      public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();
        System.out.println(cars);
      }
    }


            output, []

**To remove all the elements in the ArrayList, use the clear() method:

             5, ArrayList Size
To find out how many elements an ArrayList have, use the size method:

e.g
        import java.util.ArrayList;

        public class Main {
          public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars.size());
          }
        }
         output, 4

             6, Loop Through an ArrayList

Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

        e.g
        import java.util.ArrayList;

        public class Main {
          public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            for (int i = 0; i < cars.size(); i++) {
              System.out.println(cars.get(i));
            }
          }
        }
        output, Volvo
                BMW
                Ford
                Mazda

           7, Loop through an ArrayList with the for-each loop:
               e.g

             import java.util.ArrayList;

                public class Main {
                  public static void main(String[] args) {
                    ArrayList<String> cars = new ArrayList<String>();
                    cars.add("Volvo");
                    cars.add("BMW");
                    cars.add("Ford");
                    cars.add("Mazda");
                    for (String i : cars) {
                      System.out.println(i);
                    }
                  }
                }

            output, Volvo
                BMW
                Ford
                Mazda

            8, Other Types

Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String".
Remember that a String in Java is an object (not a primitive type).
To use other types, such as int, you must specify an equivalent wrapper class:
Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

            8.1, e.g

      Create an ArrayList to store numbers (add elements of type Integer):

        import java.util.ArrayList;

        public class Main {
          public static void main(String[] args) {
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(10);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(25);
            for (int i : myNumbers) {
              System.out.println(i);
            }
          }
        }

        output      10
                    15
                    20
                    25

        9, Sort an ArrayList

    Another useful class in the java.util package is the Collections class,
    which include the sort() method for sorting lists alphabetically or numerically:

    e.g
    import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars);

    for (String i : cars) {
      System.out.println(i);
    }
  }
}

output,     BMW
            Ford
            Mazda
            Volvo

            its sorts' alphabetically

            e.g2 Sort an ArrayList of Integers:

                import java.util.ArrayList;
                import java.util.Collections;

                public class Main {
                  public static void main(String[] args) {
                    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
                    myNumbers.add(33);
                    myNumbers.add(15);
                    myNumbers.add(20);
                    myNumbers.add(34);
                    myNumbers.add(8);
                    myNumbers.add(12);

                    Collections.sort(myNumbers);

                    for (int i : myNumbers) {
                      System.out.println(i);
                    }
                  }
                }

                output,         8
                                12
                                15
                                20
                                33
                                34





    */
}
