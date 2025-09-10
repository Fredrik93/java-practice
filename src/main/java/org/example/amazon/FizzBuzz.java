package org.example.amazon;

public class FizzBuzz
{
    public static void fizzBuzz(int n) {
        // Write your code here
        // loop for each i in n
        // if i is a multiple of 3 and 5, print fizzbuss
        for(int i=1; i<n+1; i++){

            int mod3 = i % 3;
            int mod5 = i % 5;
            if(mod3 == 0 && mod5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(mod3 == 0 && mod5 != 0 ){
                System.out.println("Fizz");
            } else if(mod3 != 0 && mod5 == 0){
                System.out.println("Buzz");
            }
            else {
                //print default
                System.out.println(i);

            }
        }
    }
}
