public class JavaHashSet {
    /*

     Java HashSet

A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

    e.g

    Create a HashSet object called cars that will store strings:

    import java.util.HashSet; // Import the HashSet class

    HashSet<String> cars = new HashSet<String>();

            1, Add Items
The HashSet class has many useful methods. For example, to add items to it, use the add() method:

   e.g
        // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars);
          }
        }

        output, [Volvo, Mazda, Ford, BMW]

        **Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.

        2, Check If an Item Exists, even items are repeated it show only one of all repeated values

To check whether an item exists in a HashSet, use the contains() method:

  e.g
        // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars.contains("Mazda"));
          }
        }
        output, true

        3, Remove an Item
To remove an item, use the remove() method:

        e.g
        // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            cars.remove("Volvo");
            System.out.println(cars);
          }
        }
        output, [Mazda, Ford, BMW]

        ** To remove all items, use the clear() method:

        4,HashSet Size
To find out how many items there are, use the size method:

        e.g
        // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars.size());
          }
        }

        output, 4

        5, Loop Through a HashSet

Loop through the items of an HashSet with a for-each loop:
        e.g
        // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            for (String i : cars) {
              System.out.println(i);
            }
          }
        }
        output,
         Volvo
        Mazda
        Ford
        BMW

        6, Other Types

Items in an HashSet are actually objects. In the examples above, we created items (objects) of type "String".
Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

        e.g  Use a HashSet that stores Integer objects:

                // Import the HashSet class
        import java.util.HashSet;

        public class Main {
          public static void main(String[] args) {

            // Create a HashSet object called numbers
            HashSet<Integer> numbers = new HashSet<Integer>();

            // Add values to the set
            numbers.add(4);
            numbers.add(7);
            numbers.add(8);

            // Show which numbers between 1 and 10 are in the set
            for(int i = 1; i <= 10; i++) {
              if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
              } else {
                System.out.println(i + " was not found in the set.");
              }
            }
          }
        }

        output,
        1 was not found in the set.
        2 was not found in the set.
        3 was not found in the set.
        4 was found in the set.
        5 was not found in the set.
        6 was not found in the set.
        7 was found in the set.
        8 was found in the set.
        9 was not found in the set.
        10 was not found in the set.


   */
}
