public class JavaString {
    /*
     Strings
           1,  The String data type is used to store a sequence of characters (text).

           2,  String values must be surrounded by double quotes:

            Example
            String greeting = "Hello World";
            System.out.println(greeting);

           3, The String type is so much used and integrated in Java, that some call it "the special ninth type".

           4, A String in Java is actually a non-primitive data type, because it refers to an object.

           5,  The String object has methods that are used to perform certain operations on strings.

           6, A String in Java is actually an object, which contain methods that can perform certain operations on strings.
                 For example, the length of a string can be found with the length() method: the counting from 1

           e.g String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
               System.out.println("The length of the txt string is: " + txt.length());

               the output is 26, it start counting from 1

            7, There are many string methods available, for example toUpperCase() and toLowerCase()
                e.g String txt = "Hello World";
                    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
                    System.out.println(txt.toLowerCase());   // Outputs "hello world"

            8, Finding a Character in a String
                The indexOf() method returns the index (the position) of the first occurrence
                of a specified text in a string (including whitespace)  whitespace counted also the counting start from zero
                   e.g   String txt = "Please locate where 'locate' occurs!";
                         System.out.println(txt.indexOf("locate")); // Outputs 7

           9, string special characters

           String txt = "We are the so-called "Vikings" from the north."; this creates an error since sting uses quotes
           if we needed the output to bring the quotes, we use the below special characters

            9.1 single quote or \'

            e.g     String txt = "It\'s alright.";
                     System.out.println(txt);

                               the output is,   It's alright.

            9.2 double quote or \"

               e.g   String txt = "We are the so-called \"Vikings\" from the north.";
                      System.out.println(txt);

                      the output is,   We are the so-called "Vikings" from the north.

            9.3 backslash or \\

                 e.g     String txt = "The character \\ is called backslash.";
                         System.out.println(txt);

                         the output is, The character \ is called backslash.

          10, Java Escape sequence

              10.1 NewLine or \n

            e.g String txt = "Hello\nWorld!";
                 System.out.println(txt);

                the output,   Hello
                              World!

                10.2 CarriageReturn or \r

            e.g String txt = "Hello\nWorld!";
                 System.out.println(txt);

                the output,   Hello
                              World!

                              ** the basic difference between carriage and newline is the printing from the very first paper print**

                  10.3   tab or \t

                  e.g String txt = "Hello\tWorld!";
                      System.out.println(txt);

                      the output is, Hello    World!

                  10.4  backspace or \b

                  e.g String txt = "Hel\blo World!";
                      System.out.println(txt);

                      the output is, Helo World!
*/

}
