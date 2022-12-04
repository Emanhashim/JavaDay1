public class JavaDataTypes {
    /*

    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

    1, Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes

    2, Primitive Data Types

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

Data Type	 Size	           Description
byte	    1 byte	     Stores whole numbers from -128 to 127
short	    2 bytes	     Stores whole numbers from -32,768 to 32,767
int	        4 bytes      Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	    8 bytes	     Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	    8 bytes	     Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	    1 bit	     Stores true or false values
char	    2 bytes	     Stores a single character/letter or ASCII values


   3, Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

      3.1  Integer Types

          3.1.1 Byte
The byte data type can store whole numbers from -128 to 127.
This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127

       3.1.2 Short
The short data type can store whole numbers from -32768 to 32767

      3.1.3  Int
      The int data type can store whole numbers from -2147483648 to 2147483647.
      In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

    3.1.4  Long

    The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
     This is used when int is not large enough to store the value. Note that you should end the value with an "L"
     long myNum = 15000000000L;

     3.2 Floating Point  Type

     You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
    The float and double data types can store fractional numbers.
    Note that you should end the value with an "f" for floats and "d" for doubles

  float myNum = 5.75f;
  double myNum = 19.99d; (for double it works even tho there is no d value at the end of assigned value)

  Note,
  *  floating point value indicates how many digits the value can have after the decimal point.
     The precision of float is only six or seven decimal digits.

  *  double variables have a precision of about 15 digits. Therefore it is safer to use double for most calculations.


  e.g
  double sum = 19.9999999;
        double sum2 = 19.9966;
        double sum3 = sum * sum;
 System.out.print(sum3);     the result is  399.99999599999995


 e.g2   float sum = 19.9999999f;
        float sum2 = 19.9966f;
        float sum3 = sum * sum;
 System.out.print(sum3);  400.0

 means with double we can get the exact value while float type puts the approximate result

        3.2.1  Scientific Numbers
            A floating point number can also be a scientific number with an "e" to indicate the power of 10:

            Example
            float f1 = 35e3f;
            double d1 = 12E4d;
            System.out.println(f1);
            System.out.println(d1);
                                           OutPut
                                           35000.0
                                           120000.0

    */


}
