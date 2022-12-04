public class JavaTypeCasting {

    /*
    Type casting is when you assign a value of one primitive data type to another type.

            In Java, there are two types of casting:

            Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte

            1, Widening Casting

               Widening casting is done automatically when passing a smaller size type to a larger size type
               e.g
                    int myInt = 9;
                    double myDouble = myInt; // Automatic casting: int to double

                    System.out.println(myInt);
                    System.out.println(myDouble);


                    output, 9
                            9.0

         2, Narrowing Casting

            Narrowing casting must be done manually by placing the type in parentheses in front of the value

            e.g
                double myDouble = 9.78d;
                int myInt = (int) myDouble; // Explicit casting: double to int

                System.out.println(myDouble);
                System.out.println(myInt);

                output, 9.78
                        9


     */
}
