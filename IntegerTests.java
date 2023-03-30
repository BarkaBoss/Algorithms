import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerTests {

    SumOfDigits sumOfDigits;
    @Before
    public void SetUp(){
        sumOfDigits = new SumOfDigits();
    }

    @Test
    public void testIntegerSum(){
        assertEquals(15, sumOfDigits.sumNumbers(12345));
    }
}
