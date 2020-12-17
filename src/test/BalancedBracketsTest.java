package test;


import main.BalancedBrackets;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void  stringInBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void halfStringInBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "Launch[Code]"));
    }

    @Test
    public void bracketsBeforeStringTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyStringTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void emptyBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void backwardBracketsStringFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }
    @Test
    public void backwardBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets( "Launch]Code["));
    }
    @Test
    public void backwardBracketsOnlyFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void notClosingBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}