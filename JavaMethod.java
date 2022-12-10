public class JavaMethod {

/*

    Java Method's

    A method is a block of code which only runs when it is called.

    You can pass data, known as parameters, into a method.

    Methods are used to perform certain actions, and they are also known as functions.

    Why use methods? To reuse code: define the code once, and use it many times.

        1, Create a Method

    A method must be declared within a class.
    It is defined with the name of the method, followed by parentheses ().
    Java provides some pre-defined methods, such as System.out.println(),  its a built in method to print whats inside
    but you can also create your own methods to perform certain actions:

    e.g            public class Main {
                  static void myMethod() {
                    // code to be executed
                  }

        myMethod() is the name of the method
        static     means that the method belongs to the Main class and not an object of the Main class.
                   it can be accessed with out creating an object, cause it belongs to class
        void      means that this method does not have a return value.

        2, Call a Method

    To call a method in Java, write the method's name followed by two parentheses () and a semicolon;

    In the following example, myMethod() is used to print a text (the action), when it is called:

     e.g   Inside main, call the myMethod() method:

                    public class Main {
                      static void myMethod() {
                        System.out.println("I just got executed!");
                      }

                      public static void main(String[] args) {
                        myMethod();
                      }
                    }

                    // Outputs "I just got executed!"


                    also methods can be called multiple times,
                         myMethod();
                          myMethod();
                           myMethod();.... as many as we wanted to

*/

}
