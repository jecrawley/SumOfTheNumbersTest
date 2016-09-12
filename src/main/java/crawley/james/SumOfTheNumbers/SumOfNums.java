package crawley.james.SumOfTheNumbers;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class SumOfNums {

    int number;

    public SumOfNums () {

    }

    public int sumNums (int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    public int getValidNumberFromUser() {
        Scanner scan = new Scanner(System.in);

        try {
            number = Integer.parseInt(scan.next());
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Please input an integer.");
            getValidNumberFromUser();
        }

        scan.close();
        return number;
    }
}
