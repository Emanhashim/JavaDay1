public class JavaVariables {

//    we will see different types of variables
/*
1,
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

2, declaring a variable syntax
type variableName = value;

Where type is one of Java's types (such as int or String),
 and variableName is the name of the variable (such as x or name).
 The equal sign is used to assign values to the variable.

 3, how we assign

 String name = "eman";
 char sex ='F';
 int sum = 20;
 float x = 5.66f;
 boolean bol = true;

 4, if you assign a new value to an existing variable,
  it will overwrite the previous value:

  int sum = 25;
  sum = 30; (now sum is 30 cause it overwrite the values)

  5, final or  constant variables and other variables
  we use final or const values to avoid overwriting our existing value like we have seen of section 4

   final int sum = 25;
   sum = 30; this brings error since our final variable is readonly


  6, The difference between constant and other variables

  6.1 constant names should be all in uppercase and word separated by underscore or use snake case
  e.g final int VARIABLE_NAME = value;

  6.2, they can be used as a variable
  6.3,

  The only difference between final and const is that the const makes the variable constant from compile-time only.
   Using const on an object, makes the object's entire deep state strictly fixed at compile-time and
   that the object with this state will be considered frozen and completely immutable
**

 */

    public static void main (String [] args){

//        constant  int  x = 20;
//        x = 56;   we can do this
        double sum = 19.9999999;
        double sum2 = 19.9966;
        double sum3 = sum * sum;
 System.out.print(sum3);

    }



}

