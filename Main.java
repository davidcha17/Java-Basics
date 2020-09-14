package com.company;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
//importing built-in libraries from the java's util library

public class Main {

    public static void main(String[] args) {
//	 main method in the program should ALWAYS be static

        byte age = 30;
        byte herAge = age;

        int views = 1_321_213_123;
        long likes = 123_456_678_986L;
        float price = 19.99F;
        /*
        Initially, Java will automatically assume that all declared integers are int, which is why we would have to
        insert the first letter of the type after the number. Because numbers can sometimes be confusing we can use
        underscores (_) as commas.
        */
        char letter = 'A';
        boolean isEligible = false;
//        if a primitive data type is not initialized, Java will give it a default value: 0, '\u0000', NULL, false, etc

//        System.out.println(price);
//        System.out.println(views);

        Date now = new Date();
//          reference type
//        System.out.println(now)
        /*
        Memory Management
        */
        byte x = 1;
        byte y = 1;
//        independent of each other, they're in different places in memory
        Point point1 = new Point(1,1);
//        the variables x and y are being inputted automatically
        Point point2 = point1;
        point1.x = 3;
//        System.out.println(point2);
        /*
        Reference types are copied from the references and primitive types are copied by their value and these
        values are all independent from each other.
        */
        String greetings = "I am a string" + "concatenated the strings with +";
        /*
        greetings.endsWith("+");
        greetings.startsWith("+");
        greetings.length();
        greetings.indexOf("g");
        greetings.replace("+", "*");
        System.out.println(greetings);

        Any method that modifies a string returns a new string object while the old string is immutable. The String
        class contains built-in methods that does something with the string, look above for a few of them.
        */
        String message = "c:\tWindows\\...";
        /*
        "c:\\Windows\\..."
        "c:\nWindows\\..."
        "Hello \"David\""
        escape sequences that you are allowed to do in Java, these are the four I should know.
         */
//        System.out.println(message);

//        Arrays in Java
        int [] numbers = new int[5]; /* initialize the size of the array */
        /* A new syntax to initialize a new array is: int [] numbers = { 1, 2, 3, 4, 5 } */
        numbers[0] = 2;
        numbers[1] = 1;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 3;
//        numbers[9] = 5 will throw an exception error. Exceptions are Javas way to report errors
//        were allowed to use the Array class to use overload methods to organize the array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//        CANNOT ADD OR REMOVE additional elements into an array, they have a fixed length

        int [][] multiArray = new int[2][3];
//        or new syntax way: int [][] multiArray = { { 1, 2, 3 }, { 4, 5, 6 } }
        System.out.println(Arrays.deepToString(multiArray));
//        there are also cube dimension arrays

        final float PI = 3.14F;
        /*
        PI = 1; WILL NOT WORK because the key word final creates the variable pi into a constant. Meaning that the
        initial value cannot change at all. By convention, constant variables should be capitalized
        */

        /*
        when it comes to math, the primitive data type must be consistent, if you create an int variable and you
        are trying to get a result of a double or float, it will not work.
        We can also increment/decrement the values of a variable with ++ and --
         */
        int num = 1;
        int check = num++;
//        System.out.println(check);
//        System.out.println(num);
//        System.out.println(num++);
//        System.out.println(++num);
//        System.out.println(num++ + ++num); /* Postfix and prefix */
//        System.out.println(num += 5); /* augmented assigned operators */

        short notInt = 1;
        int sum = notInt + 2;
        /*
        the value we get is 3, but how does two different primitive data types converge into one? it is called
        implicate casting: automatic casting or automatic version, we dont have to worry about it.
        byte > short > int > long > float > double
        This happens when we know we arent going to lose data (no chance for data loss)
        */
        System.out.println(sum);

        double z = 1.1;
        int a = (int)z + 2;
        /*
        explicit casting is where we change the data type of the variable or value
         */
        System.out.println(a);
//        Now let's say we wanted to add a string into an integer, how would we do that? Grab the package Integer.
        String p = "1";
//        Integer.parseInt(p);
        int l = Integer.parseInt(p) + 2;
        System.out.println(l);

        String string = "1.4";
        double converting = Double.parseDouble(string) + 3;
        System.out.println(converting);
        /*
        Here we are trying to convert a string into a double, just like how we converted the string into an int
        it is the same process, there are many ways to parse a string into any primitive data type. They are all
        part of a package in Java
         */




    /*
    In order to get the code compiler running through the terminal, you can left click on the Main.java file
    and 'open in terminal'. type in javac Main.java because we need to go into the directory and we change directory
    by 'cd ..' until we get to src directory. Once we at the src directory, type in
    'java com.company.Main'. This we it will skip the compilation phase or execution. (only results)
    *it is case sensitive camel casing your files are important.
     */
    }
}
