package edu.vit.corejava.exceptionHandling;

public class PasswordException extends Exception {
    /**
     * here we will create a constructor of this class which will invoke a parameterised constructor
     * of Exception class
     */
    public PasswordException(String message)
    {
        super(message);// this will invoke parameterized constructor of exception class
    }
    
}
