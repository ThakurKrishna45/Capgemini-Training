package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {
    @Test
    public void concatenateTestSuccess(){
        StringProcessor sp= new StringProcessor();
        assertEquals("HelloWorld",sp.concatenate("Hello","World"));
    }
    @Test
    public void testConcatenateEdge(){
        StringProcessor sp= new StringProcessor();
        assertThrows(IllegalArgumentException.class,()->sp.concatenate(null,"hello"));
    }
    @Test
    public void testIsPalindromeTrue(){
        StringProcessor sp= new StringProcessor();
        assertTrue(sp.isPalindrome("radar"));
    }
    @Test
    public void testIsPalindromeFalse(){
        StringProcessor sp= new StringProcessor();
        assertFalse(sp.isPalindrome("Java"));
    }
    @Test
    public void testIsPalindromeNull(){
        StringProcessor sp= new StringProcessor();
        assertFalse(sp.isPalindrome(null));
    }
}
