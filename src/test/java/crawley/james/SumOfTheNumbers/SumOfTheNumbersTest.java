package crawley.james.SumOfTheNumbers;//package crawley.james.SumOfTheNumbers;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class SumOfTheNumbersTest {

    @Test
    public void sumOfTheNumbersTest () {
        SumOfNums sumOfNums = new SumOfNums();
        Assert.assertEquals("The value should be equal to 1", 1, sumOfNums.sumNums(1));
        Assert.assertEquals("The value should be equal to 3", 3, sumOfNums.sumNums(2));
        Assert.assertEquals("The value should be equal to 6", 6, sumOfNums.sumNums(3));
        Assert.assertEquals("The value should be equal to 10", 10, sumOfNums.sumNums(4));
        Assert.assertEquals("The value should be equal to 15", 15, sumOfNums.sumNums(5));

    }
}
