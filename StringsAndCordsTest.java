import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsAndCordsTest {
    
    StringsAndCords stringsAndCords;
    
    @Before
    public void Setup(){
        stringsAndCords = new StringsAndCords();
    }
    
    
    @Test
    public void reverseString(){
        assertEquals("alasuM",
                stringsAndCords.reverseString("Musala"));
    }

    @Test
    public void checkUniqueTrue(){
        assertTrue("Should return true",
                stringsAndCords.uniqueCharacters("Casted"));
    }

    @Test
    public void checkUniqueFalse(){
        assertFalse("Should return false",
                stringsAndCords.uniqueCharacters("Musala"));
    }

    @Test
    public void checkPalindrome(){
        assertTrue("Should return true",stringsAndCords.checkPalindrome("civic"));
    }

    @Test
    public void testFibonacci(){
        assertEquals(21, Fibonacci.getNthFib(9));
    }
}
