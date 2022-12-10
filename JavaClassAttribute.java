public class JavaClassAttribute {
    /*

   Java Class Attributes

  It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
    e.g
            public class Main {
          int x = 5;
          int y = 3;
        }
    Another term for class attributes is fields.

      1, Accessing Attributes

    You can access attributes by creating an object of the class, and by using the dot syntax (.):

    The following example will create an object of the Main class, with the name myObj.
     We use the x attribute on the object to print its value:

    e.g
    Create an object called "myObj" and print the value of x:

    public class Main {
      int x = 5;

      public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
      }
      }

      2, Modify Attributes

        You can also modify attribute values:

        e.g
        Set the value of x to 40:

        public class Main {
          int x;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 40;
            System.out.println(myObj.x);
          }
        }

      e.g 2
            Change the value of x to 25:

            public class Main {
              int x = 10;

              public static void main(String[] args) {
                Main myObj = new Main();
                myObj.x = 25; // x is now 25
                System.out.println(myObj.x);
              }
            }

       3, Multiple Objects

        If you create multiple objects of one class, you can change the attribute values in one object,
        without affecting the attribute values in the other:

        e.g
        Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj1 = new Main();  // Object 1
            Main myObj2 = new Main();  // Object 2
            myObj2.x = 25;
            System.out.println(myObj1.x);  // Outputs 5
            System.out.println(myObj2.x);  // Outputs 25
          }
        }

        4, Multiple Attributes

        You can specify as many attributes as you want:

        e.g

        public class Main {
          String fname = "John";
          String lname = "Doe";
          int age = 24;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Age: " + myObj.age);
          }
        }



    */
}
