package edu.vit.corejava.exceptionHandling;

public class PasswordValidator {
    // here we are defining a static method so it can be called using the class name
    public static void checkPassword(String password) throws PasswordException
    {
        if(password.length()<8)
        {
            throw new PasswordException("password should be minimum 8 characters");
        }
        else{
            char a;
            int upChar=0,lowChar=0,digits=0,specialChar=0;
            for(int i=0;i<password.length();i++)
            {
                a=password.charAt(i);
                if(Character.isUpperCase(a)) upChar++;// Character is a class which has this static methods
                else if(Character.isLowerCase(a)) lowChar++;
                else if(Character.isDigit(a)) digits++;
                else specialChar++;
            }
            if(upChar==0)
            throw new PasswordException("Should contain atleast one upper case alphbet");
            if(lowChar==0)
            throw new PasswordException("should contain atleast one lower case alphabet");
            if(digits==0)
            throw new PasswordException("should contain atleast one digit");
            if(specialChar==0)
            throw new PasswordException("should contain atleast one special character");
        }
    }
    
}
