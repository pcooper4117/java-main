
package com.techelevator;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FizzWriter {
    public static void main(String[] args) throws IOException {
        System.out.println("Program has started..");
        File fizzBuzz = new File("FizzBuzz.txt");
        fizzBuzz.createNewFile();
        PrintWriter fileWriter = new PrintWriter(fizzBuzz);
        for (int i =1; i< 300; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                fileWriter.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                fileWriter.println("Buzz");
            }
            else if (i % 3 == 0) {
                fileWriter.println("Fizz");
            }
            else if (Integer.toString(i).contains("3")) {
                fileWriter.println("Fizz");
            }
           else if (Integer.toString(i).contains("5")) {
            fileWriter.println("Buzz");
            }   
            else {
            fileWriter.println(i);
                }
    }
            fileWriter.close();
            System.out.println("Program has ended..");
}
}