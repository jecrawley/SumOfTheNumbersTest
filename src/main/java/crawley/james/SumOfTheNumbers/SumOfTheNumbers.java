package crawley.james.SumOfTheNumbers;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class SumOfTheNumbers {

    public static void main(String[] args) {
        SumOfNums sumOfNums = new SumOfNums();
        int n;

        System.out.println("This program sums up the numbers from 1 until a given value.");
        System.out.println("Please input a number: ");

        n = sumOfNums.getValidNumberFromUser();
        System.out.println(sumOfNums.sumNums(n));

    }
}
