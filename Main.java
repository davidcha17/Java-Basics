package com.company;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
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
//        System.out.println(Arrays.toString(numbers));
//        CANNOT ADD OR REMOVE additional elements into an array, they have a fixed length

        int [][] multiArray = new int[2][3];
//        or new syntax way: int [][] multiArray = { { 1, 2, 3 }, { 4, 5, 6 } }
//        System.out.println(Arrays.deepToString(multiArray));
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
//        System.out.println(sum);

        double z = 1.1;
        int a = (int)z + 2;
        /*
        explicit casting is where we change the data type of the variable or value
        */
//        System.out.println(a);
//        Now let's say we wanted to add a string into an integer, how would we do that? Grab the package Integer.
        String p = "1";
//        Integer.parseInt(p);
        int l = Integer.parseInt(p) + 2;
//        System.out.println(l);

        String string = "1.4";
        double converting = Double.parseDouble(string) + 3;
//        System.out.println(converting);
        /*
        Here we are trying to convert a string into a double, just like how we converted the string into an int
        it is the same process, there are many ways to parse a string into any primitive data type. They are all
        part of a package in Java
        */

//        Math class for mathematical operations

        int roundNum = Math.round(2.1F);
        int ceilNum = (int)Math.ceil(2.1F);
        int floorNum = (int)Math.floor(2.9F);
        int maxNum = Math.max(9,2);
//        System.out.println(maxNum);

        double randomNum = Math.random();
        double randomNum2 = Math.random() * 100;
        double randomNum3 = Math.floor(Math.random() * 100); /* this will make still make the random number a decimal with only the tenth place */
//        int randomNum4 = Math.floor(Math.random() * 100); will not work because implicate casting does not work. Math.floor is meant with floats and longs
        int randomNum4 = (int) (Math.floor(Math.random() * 100)); /* explicit casting on the operator Math.floor */
        int randomNum5 = (int) Math.random() * 100;
        int randomNum6 = (int) (Math.random() * 100);
        /*
        line 147 will only print out a random number between 0 and 1 because of the double type
        line 148 is only picking a number between 0 and 100 with the decimals, get rid of the decimals by casting a change of rounding the number
        line 152 we will only get 0 because were only casting on Math.random() and not with the * 100
        line 153 will work because were making sure that the random num is being multiplied by a 100 first before we cast the result into an int
        */
//        System.out.println(randomNum6);

//        Number formatting --> NumberFormat is a java.text package

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.123);
//  note you can also change the variable name into something better by refactoring it on IntelliJ by shit + f6
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(.348);

        String methodChaining = NumberFormat.getPercentInstance().format(.23); /* this is called method chaining: chaining multiple methods together */
        /*
        To get a currency or percentage, we must use the java.text package and then declare the class to a variable and what we want from that class
        on line 165 we want to get the currency instance and on line 166, the currency will become a string and we will create a String variable associated
        to the number that is going to be stringed. Everytime  we print line 166 we will get $some_value everytime. Line 168 and 169 are the same as well, were
        just changing a decimal number into a percent with built-in methods.
        */
//        System.out.println(methodChaining);

//        Getting user input --> Scanner package from java.util

//        Scanner scanner = new Scanner(System.in);
        /* scanner.next <-- many methods we can use when we declare next on the Scanner variable */
//        System.out.println("How many fingers do you have?");
//        System.out.print("fingers: ");
//        byte fingers = scanner.nextByte();
//        System.out.println("I have " + fingers + " is that weird?");

//        Scanner getName = new Scanner(System.in);
//        System.out.print("Name: ");
//        String nameIs = getName.nextLine().trim();
//        System.out.println("My name is: " + nameIs);

        /*
        To get a user's input we must use System.in, just like how we use System.out to print something out from the terminal. (Need an input to go into the
        terminal) Scanner is a class in Java that takes in inputs of primitive types. The easiest way to read input in Java, but not for efficient competitive
        coding. We can organize what we need by telling the user: what we need from them with sout and show them what to put in with a print. You are also
        able to chain methods on the inputs, to make it more organized like on line 192.
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
