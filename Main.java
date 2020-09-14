package com.company;
import java.awt.*;
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
        System.out.println(message);


    /*
    In order to get the code compiler running through the terminal, you can left click on the Main.java file
    and 'open in terminal'. type in javac Main.java because we need to go into the directory and we change directory
    by 'cd ..' until we get to src directory. Once we at the src directory, type in
    'java com.company.Main'. This we it will skip the compilation phase or execution. (only results)
    *it is case sensitive camel casing your files are important.
     */
    }
}
