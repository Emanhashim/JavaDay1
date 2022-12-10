public class JavaIteration {
    /*

         Java Iterator

An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
It is called an "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util package.


        1, Getting an Iterator
The iterator() method can be used to get an Iterator for any collection:

        e.g

                import java.util.ArrayList;
                import java.util.Iterator;

                public class Main {
                  public static void main(String[] args) {

                    // Make a collection
                    ArrayList<String> cars = new ArrayList<String>();
                    cars.add("Volvo");
                    cars.add("BMW");
                    cars.add("Ford");
                    cars.add("Mazda");

                    // Get the iterator
                    Iterator<String> it = cars.iterator();

                    // Print the first item
                    System.out.println(it.next());
                  }
                }

                output,  Volvo

            2, Looping Through a Collection

To loop through a collection, use the hasNext() and next() methods of the Iterator:

  e.g
        import java.util.ArrayList;
        import java.util.Iterator;

        public class Main {
          public static void main(String[] args) {

            // Make a collection
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            // Get the iterator
            Iterator<String> it = cars.iterator();

            // Loop through a collection
            while(it.hasNext()) {
              System.out.println(it.next());
            }
          }
        }

   output,
            Volvo
            BMW
            Ford
            Mazda

            3, Removing Items from a Collection

    Iterators are designed to easily change the collections that they loop through.
    The remove() method can remove items from a collection while looping.

            e.g

            import java.util.ArrayList;
        import java.util.Iterator;

        public class Main {
          public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(12);
            numbers.add(8);
            numbers.add(2);
            numbers.add(23);
            Iterator<Integer> it = numbers.iterator();
            while(it.hasNext()) {
              Integer i = it.next();
              if(i < 10) {
                it.remove();
              }
            }
            System.out.println(numbers);
          }
        }

        output,
        [12, 23]

        ** Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.
   */
}
